package com.vsap.fantasydress.controllers;

import com.vsap.fantasydress.models.UserModel;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
    
    public boolean saveUser(UserModel user) {
        return true;
    }
}
