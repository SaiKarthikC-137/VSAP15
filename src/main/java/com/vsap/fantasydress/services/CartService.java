package com.vsap.fantasydress.services;

import java.util.List;

import com.vsap.fantasydress.models.CartModel;
import com.vsap.fantasydress.repositories.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    public CartRepository cartRepository;

    public List<CartModel> getAllItems(Integer userId) {
        return cartRepository.findByUserId(userId);
    }

    public void addItem(CartModel cart) {
        cartRepository.save(cart);
    }

    public void deleteProduct(String id) {
        cartRepository.deleteByProductName(id);
    }
    
}
