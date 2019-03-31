package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class loginController {
    @GetMapping("/login")
    public String getLoginPage(ModelMap model, HttpServletRequest request){
        if(request.getParameterMap().containsKey("error"))
            model.addAttribute("error",true);
        return "login";
    }
}
