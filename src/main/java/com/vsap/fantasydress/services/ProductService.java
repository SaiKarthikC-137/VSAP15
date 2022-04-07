package com.vsap.fantasydress.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.vsap.fantasydress.models.ProductModel;
import com.vsap.fantasydress.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;
    
    public List<ProductModel> getAllProducts() {
        List<ProductModel> products=new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    public void addProduct(ProductModel product) {
        productRepository.save(product);
    }

    public Optional<ProductModel> getById(String id) {
        return productRepository.findById(id);
    }

    public List<ProductModel> getByName(String name) {
        return productRepository.findByProductName(name);
    }

    public void deleteProduct(String id) {
        productRepository.deleteByProductName(id);
    }
}
