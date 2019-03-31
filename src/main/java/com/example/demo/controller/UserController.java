package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable(name = "id") Long id) {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/all")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveUser(@RequestBody User account) {
        return userService.saveUser(account);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
