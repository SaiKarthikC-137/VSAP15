package com.vsap.fantasydress.repositories;

import com.vsap.fantasydress.models.UserModel;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel,Integer>{
    
}
