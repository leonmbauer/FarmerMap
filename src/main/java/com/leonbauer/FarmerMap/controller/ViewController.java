package com.leonbauer.FarmerMap.controller;

import com.leonbauer.FarmerMap.models.User;
import com.leonbauer.FarmerMap.routines.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    @Autowired
    UserService userService;

//    @GetMapping("/register")
//    public ModelAndView registerForm() {
//        return new ModelAndView("register.html", "user", new User());
//    }
//
//    @PostMapping("/register")
//    public String registerSuccess(User user) {
//        userService.createUser(user);
//        return "registrationResult.html";
//    }
}
