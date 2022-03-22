package com.vsap.fantasydress.controllers;

import com.vsap.fantasydress.models.LoginModel;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    public boolean checkUser(LoginModel data) {
        return true;
    }
}
