package com.vsap.fantasydress.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vsap.fantasydress.models.UserModel;
import com.vsap.fantasydress.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean addUser(UserModel user) {
        return userRepository.save(user)!=null;
    }

    public Optional<UserModel> getUser(Integer id) {
        return userRepository.findById(id);
    }

    public List<UserModel> getAllUsers() {
        List<UserModel> users=new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public List<UserModel> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
