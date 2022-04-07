package com.vsap.fantasydress.controllers;


import com.vsap.fantasydress.models.LoginModel;
import com.vsap.fantasydress.models.UserModel;
import com.vsap.fantasydress.services.LoginService;
import com.vsap.fantasydress.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    public LoginService loginService;

    @Autowired
    public UserService userService;

    @PostMapping("/login")
    public boolean checkUser(@RequestBody LoginModel data) {
        UserModel user;
        
        try {
            user=userService.getUserByEmail(data.getEmail()).get(0);
        } catch (Exception e) {
            return false;
        }
        if(!user.getPassword().equals(data.getPassword())) {
            return false;
        }
        return loginService.addLogin(data);
    }

    
}
