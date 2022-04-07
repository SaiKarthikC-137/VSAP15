package com.vsap.fantasydress.repositories;

import java.util.List;

import com.vsap.fantasydress.models.ProductModel;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel,String>{
    void deleteByProductName(String ProductName);

    List<ProductModel> findByProductName(String productName);
    
}
