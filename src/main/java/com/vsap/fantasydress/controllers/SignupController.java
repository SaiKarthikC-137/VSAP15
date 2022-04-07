package com.vsap.fantasydress.controllers;

import com.vsap.fantasydress.models.UserModel;
import com.vsap.fantasydress.services.LoginService;
import com.vsap.fantasydress.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @Autowired
    public UserService userService;

    @Autowired
    public LoginService loginService;
    
    @PostMapping("/signup")
    public boolean saveUser(@RequestBody UserModel user) {
        return userService.addUser(user);
    }
}
