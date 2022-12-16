package com.example.zonabetsapi;

import model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "id", defaultValue = "00")String UUID){
        //get user from DB
        return new User("Jackie");
    }
}
