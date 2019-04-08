package com.example.demo.service.impl;

import com.example.demo.Form.UserForm;
import com.example.demo.entity.Role;
import com.example.demo.entity.RoleEnum;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.SignUpService;
import com.example.demo.transfers.UserDto;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.builder;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public static SignUpServiceImpl from(UserForm userForm) {

        SignUpServiceImpl.builder()
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .hashPassword(hashPassword)
                .login(userForm.getUserName())
                .role(RoleEnum.ROLE_USER)
                .build();

        userRepository.save(user);
    }


    @Override
    public void signUp(UserForm userForm) {

    }
}




