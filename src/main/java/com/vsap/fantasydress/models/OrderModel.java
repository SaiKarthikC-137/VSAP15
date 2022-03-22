package com.vsap.fantasydress.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "ordermodel")
public class OrderModel {
    @Id
    @GeneratedValue
    private String orderId;
    @ManyToOne(cascade = CascadeType.ALL)
    private UserModel userId;
    private String ProductName;
    private int quantity;
    private String totalPrice;
    private String Status;
    private String Price;
    public OrderModel() {
    }
    public OrderModel(String orderId, UserModel userId, String productName, int quantity, String totalPrice, String status,
            String price) {
        this.orderId = orderId;
        this.userId = userId;
        ProductName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        Status = status;
        Price = price;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public UserModel getUserId() {
        return userId;
    }
    public void setUserId(UserModel userId) {
        this.userId = userId;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        Price = price;
    }
}