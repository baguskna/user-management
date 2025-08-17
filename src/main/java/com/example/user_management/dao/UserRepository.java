package com.example.user_management.dao;

import com.example.user_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be defined here if needed
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
