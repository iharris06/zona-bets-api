package com.example.zonabetsapi;

import model.Bet;
import model.Contest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@RestController
public class BetController {
    private final Logger LOGGER = LoggerFactory.getLogger(BetController.class);

    @GetMapping("/bet")
    public ResponseEntity<Bet> getBet(@RequestParam(value = "id", defaultValue = "00") String id){
        try{
            UUID contestId = UUID.fromString(id);
        } catch(Exception e){
            LOGGER.error("Exception parsing UUID from String. {}", e.getMessage());
        }

        return ResponseEntity.ok().body(new Bet(UUID.randomUUID(),UUID.randomUUID(),8));
    }

    @PostMapping("/bet")
    public ResponseEntity<Bet> createBet(@RequestBody Bet bet){
        Bet persistedBet = new Bet(bet.getPersonId(),bet.getContestId(), bet.getAmount());
        return ResponseEntity.created(URI.create(String.format("/bet/%s", persistedBet.getId()))).body(persistedBet);
    }
}
