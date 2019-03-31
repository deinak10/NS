package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    Iterable<User> getAllUsers();
    void deleteUser(Long id);
}
