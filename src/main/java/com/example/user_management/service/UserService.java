package com.example.user_management.service;

import com.example.user_management.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> findAllUsers(Pageable pageable);

    User findUserById(Long id);

    User saveUser(User user);

    void deleteUserById(Long id);
    boolean authenticateUser(String username, String password);
//    User updateUser(User user);
//    boolean usernameExists(String username);
//    boolean emailExists(String email);
}
