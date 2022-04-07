package com.vsap.fantasydress.services;

import java.util.List;

import com.vsap.fantasydress.models.CartModel;
import com.vsap.fantasydress.models.OrderModel;
import com.vsap.fantasydress.repositories.CartRepository;
import com.vsap.fantasydress.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    public OrderRepository orderRepository;
    @Autowired
    public CartRepository cartRepository;
    public List<OrderModel> getUserProducts(Integer userId) {
        return orderRepository.findByUserId(userId);
    }

    public void saveProduct(Integer userId) {
        List<CartModel> items=cartRepository.findByUserId(userId);
        for(CartModel item:items) {
            orderRepository.save(new OrderModel(userId,item.getProductName(),item.getQuantity(),item.getPrice(),"",item.getPrice()));
        }
    }
    
}
