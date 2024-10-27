package com.example.unity_quest.unity_quest_backend.controller;

import com.example.unity_quest.unity_quest_backend.model.Challenge;
import com.example.unity_quest.unity_quest_backend.model.User;
import com.example.unity_quest.unity_quest_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("myAccountTest")
    public String testAccountPage() {
        return "My user account details...";
    }

    @GetMapping("myAccount/{userId}")
    public User testAccountPage(@PathVariable Long userId) {
        return userService.findUserById(userId);
    }

    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping("saveUser")
    public User save(@RequestBody User newUser) {
        return userService.saveChallenge(newUser);
    }
}
