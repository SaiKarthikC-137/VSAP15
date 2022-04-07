package com.vsap.fantasydress.services;

import com.vsap.fantasydress.models.LoginModel;
import com.vsap.fantasydress.repositories.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    public LoginRepository loginRepository;

    public boolean addLogin(LoginModel login) {
        return loginRepository.save(login)!=null;
    }

    public LoginModel getUser() {
        return loginRepository.findAll().iterator().next();
    }
    
}
