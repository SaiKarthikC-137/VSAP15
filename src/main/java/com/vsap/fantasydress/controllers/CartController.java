package com.vsap.fantasydress.controllers;

import java.util.List;

import com.vsap.fantasydress.models.CartModel;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    

    public void addToCart(String quantity, String id) {

    }

    public List<CartModel> showCart(String id) {
        return null;
    }

    public void deleteCartItem(String id) {
        
    }
}
