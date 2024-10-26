package com.example.unity_quest.unity_quest_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChallengeController {

    @GetMapping("/")
    public String testHomepage() {
        return "Hello World!";
    }

}
