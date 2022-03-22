package com.vsap.fantasydress.repositories;

import com.vsap.fantasydress.models.ProductModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel,String>{
    
}
