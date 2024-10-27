package com.example.unity_quest.unity_quest_backend.repository;

import com.example.unity_quest.unity_quest_backend.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChallengeRepository  extends JpaRepository <Challenge, Long> {

    Optional<Challenge> findById(Long id);

}
