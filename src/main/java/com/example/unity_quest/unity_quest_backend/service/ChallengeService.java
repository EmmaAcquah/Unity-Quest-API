package com.example.unity_quest.unity_quest_backend.service;

import com.example.unity_quest.unity_quest_backend.model.Challenge;
import com.example.unity_quest.unity_quest_backend.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChallengeService {

    @Autowired
    ChallengeRepository challengeRepository;

    public Challenge saveChallenge(Challenge challenge) {
        return challengeRepository.save(challenge);
    }

    public List<Challenge> getAllChallenges() {
        return challengeRepository.findAll();
    }

    public Challenge findChallengeById(Long id) {
        Optional<Challenge> challenge = challengeRepository.findById(id);

        if (challenge.isEmpty()) {
            throw new RuntimeException("Challenge not found");
        }
        return challenge.get();
    }
}
