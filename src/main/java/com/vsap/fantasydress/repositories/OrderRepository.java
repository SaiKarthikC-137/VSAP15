package com.vsap.fantasydress.repositories;

import java.util.List;

import com.vsap.fantasydress.models.OrderModel;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderModel,String>{

    List<OrderModel> findByUserId(Integer userId);
    
}
