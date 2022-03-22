package com.vsap.fantasydress.repositories;

import com.vsap.fantasydress.models.LoginModel;

import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<LoginModel,String>{
    
}
