package com.example.unity_quest.unity_quest_backend.controller;

import com.example.unity_quest.unity_quest_backend.model.Challenge;
import com.example.unity_quest.unity_quest_backend.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChallengeController {

    @Autowired
    ChallengeService challengeService;

    @GetMapping("/")
    public String testHomepage() {
        return "Welcome to Unity Quest!";
    }

    @GetMapping("/challenges")
    public List<Challenge> getAll() {
        return challengeService.getAllChallenges();
    }

    @GetMapping("challenges/{id}")
    public Challenge findById(@PathVariable Long id) {
        return challengeService.findChallengeById(id);
    }

    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping("save")
    public Challenge save(@RequestBody Challenge challenge) {
        return challengeService.saveChallenge(challenge);
    }

}
