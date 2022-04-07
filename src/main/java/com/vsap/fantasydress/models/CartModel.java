package com.vsap.fantasydress.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "cartmodel")
public class CartModel {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String cartItemId;
    private Integer userId;
    private String productName;
    private int quantity;
    private String price;
    public CartModel() {
    }
    public CartModel(Integer userId, String productName, int quantity, String price) {
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public CartModel(String cartItemId, Integer userId, String productName, int quantity, String price) {
        this.cartItemId = cartItemId;
        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public String getCartItemId() {
        return cartItemId;
    }
    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}