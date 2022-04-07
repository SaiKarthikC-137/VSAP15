package com.vsap.fantasydress.repositories;

import java.util.List;

import com.vsap.fantasydress.models.UserModel;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Integer>{
    List<UserModel> findByEmail(String email);
    
}
