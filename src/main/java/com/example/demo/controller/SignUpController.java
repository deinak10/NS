package com.example.demo.controller;

import com.example.demo.Form.UserForm;
import com.example.demo.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/SignUp")
    public String getSignUpPage(){
        return "SignUp";
    }

    @PostMapping("/SignUp")
    public String signUp(UserForm userForm){
        signUpService.signUp(userForm);
        return "redirect:/login";
    }

}
