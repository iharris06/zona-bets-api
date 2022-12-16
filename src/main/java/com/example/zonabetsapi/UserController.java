package com.example.zonabetsapi;

import com.fasterxml.jackson.databind.node.TextNode;
import model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "id", defaultValue = "00")String UUID){
        //get user from DB
        return new User("Jackie");
    }

    @PostMapping("/user")
    public User createUser(@RequestBody String name){
        return new User(name);
    }

}
