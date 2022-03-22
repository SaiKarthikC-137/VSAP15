package com.vsap.fantasydress.repositories;

import com.vsap.fantasydress.models.CartModel;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartModel,String>{
    
}
