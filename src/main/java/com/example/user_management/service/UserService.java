package com.example.user_management.service;

import com.example.user_management.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User findUserById(Long id);

    User saveUser(User user);

    void deleteUserById(Long id);
//    User authenticateUser(String username, String password);
//    User updateUser(User user);
//    boolean usernameExists(String username);
//    boolean emailExists(String email);
}
