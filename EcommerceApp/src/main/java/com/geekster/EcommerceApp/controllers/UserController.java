package com.geekster.EcommerceApp.controllers;

import com.geekster.EcommerceApp.models.User;
import com.geekster.EcommerceApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
