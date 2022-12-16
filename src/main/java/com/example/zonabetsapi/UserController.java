package com.example.zonabetsapi;

import com.fasterxml.jackson.databind.node.TextNode;
import model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UserController {
    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "id", defaultValue = "00")String id){
        //get user from DB

        try{
            java.util.UUID contestId = java.util.UUID.fromString(id);
        } catch(Exception e){
            LOGGER.error("Exception parsing UUID from String. {}", e.getMessage());
        }

        return new User("Jackie");
    }

    @PostMapping("/user")
    public User createUser(@RequestBody String name){
        return new User(name);
    }

}
