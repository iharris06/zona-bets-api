package com.example.zonabetsapi;

import model.Bet;
import model.Contest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class BetController {
    private final Logger LOGGER = LoggerFactory.getLogger(BetController.class);

    @GetMapping("/bet")
    public Bet getBet(@RequestParam(value = "id", defaultValue = "00") String id){
        try{
            UUID contestId = UUID.fromString(id);
        } catch(Exception e){
            LOGGER.error("Exception parsing UUID from String. {}", e.getMessage());
        }

        return new Bet(UUID.randomUUID(),UUID.randomUUID(),8);
    }

    @PostMapping("/bet")
    public Bet createBet(@RequestBody Bet bet){
        return new Bet(bet.getPersonId(),bet.getContestId(), bet.getAmount());
    }
}
