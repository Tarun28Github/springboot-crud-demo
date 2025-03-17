package com.ensat.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ensat.entities.User;
import com.ensat.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    
    @GetMapping("/users")
    public List<User> getMethodName() {
        return userService.getAllUser();
    }
    

}
