package com.example.unity_quest.unity_quest_backend.controller;

import com.example.unity_quest.unity_quest_backend.model.User;
import com.example.unity_quest.unity_quest_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
