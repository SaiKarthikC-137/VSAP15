package com.vsap.fantasydress.repositories;

import java.util.List;

import com.vsap.fantasydress.models.CartModel;

import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartModel,String>{

    public List<CartModel> findByUserId(Integer userId);

    public void deleteByProductName(String id);
    
}
