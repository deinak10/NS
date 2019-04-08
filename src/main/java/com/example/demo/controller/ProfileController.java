package com.example.demo.controller;

import com.example.demo.security.details.UserDetailsImpl;
import com.example.demo.transfers.UserDto;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.demo.transfers.UserDto.from;

@RestController
public class ProfileController {
    @GetMapping("/")
    public String getProfilePage(ModelMap model, Authentication authentication) {
        if (authentication == null) {
            return "redirect:/login";
            UserDetails details = (UserDetails) authentication.getPrincipal();
            UserDto user = from(details.getUsername());
            model.addAttribute("user", user);
            return "profile";

        }

    }
}
