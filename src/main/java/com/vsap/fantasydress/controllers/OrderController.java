package com.vsap.fantasydress.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.vsap.fantasydress.models.OrderModel;
import com.vsap.fantasydress.services.OrderService;

@RestController
public class OrderController {
    @Autowired
    public OrderService orderService;

    List<OrderModel> getUserProducts(String id) {
        return orderService.getUserProducts(Integer.parseInt(id));
    }
    @PostMapping("/saveOrder")
    public void saveProduct(String id) {
        orderService.saveProduct(Integer.parseInt(id));
    }
    
}
