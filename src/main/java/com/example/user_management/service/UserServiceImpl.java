package com.example.user_management.service;

import com.example.user_management.dao.UserRepository;
import com.example.user_management.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        if (user.getEmail() == null || user.getUsername() == null || user.getEmail().isEmpty() || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Email and Username cannot be null");
        }
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already registered");
        }
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("Username already taken");
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {

    }
}
