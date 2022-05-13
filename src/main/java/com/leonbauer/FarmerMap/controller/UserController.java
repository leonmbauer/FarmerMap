package com.leonbauer.FarmerMap.controller;

import com.leonbauer.FarmerMap.models.User;
import com.leonbauer.FarmerMap.routines.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    //CREATE
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    //READ
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    //DELETE
    @DeleteMapping("/users/delete")
    public String deleteUsers() {
        return userService.deleteUsers();
    }

    //login
    @PostMapping("/users/login")
    public User userLogin(@RequestBody User user) throws Exception {
        return userService.userLogin(user.getUsername(), user.getPassword());
    }
}
