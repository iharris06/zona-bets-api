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
public class ContestController {
    private final Logger LOGGER = LoggerFactory.getLogger(ContestController.class);

    @GetMapping("/contest")
    public ResponseEntity<Contest> getContest(@RequestParam(value = "id", defaultValue = "00") String id){
        try{
            UUID contestId = UUID.fromString(id);
        } catch(Exception e){
            LOGGER.error("Exception parsing UUID from String. {}", e.getMessage());
        }

        return ResponseEntity.ok().body(new Contest("Boomer Test"));
    }

    @PostMapping("/contest")
    public ResponseEntity<Contest> createContest(@RequestBody Contest contest){
        Contest persistedContest = new Contest(contest.getTitle(),contest.getResult());
        return ResponseEntity.created(URI.create(String.format("/contest/%s", persistedContest.getId()))).body(persistedContest);
    }
}
