package com.example.unity_quest.unity_quest_backend.repository;

import com.example.unity_quest.unity_quest_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
}
