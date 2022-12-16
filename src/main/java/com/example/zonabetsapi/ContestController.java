package com.example.zonabetsapi;

import model.Contest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ContestController {
    private final Logger LOGGER = LoggerFactory.getLogger(ContestController.class);

    @GetMapping("/contest")
    public Contest getContest(@RequestParam(value = "id", defaultValue = "00") String id){
        try{
            UUID contestId = UUID.fromString(id);
        } catch(Exception e){
            LOGGER.error("Exception parsing UUID from String. {}", e.getMessage());
        }

        return new Contest("Boomer Test");
    }

    @PostMapping("/contest")
    public Contest createContest(@RequestBody Contest contest){
        return new Contest(contest.getTitle(),contest.getResult());
    }
}
