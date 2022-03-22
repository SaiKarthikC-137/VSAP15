package com.vsap.fantasydress.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "cartmodel")
public class CartModel {
    @Id
    @GeneratedValue
    private String cartItemId;
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "cart")
    private UserModel userId;
    private String ProductName;
    private int Quantity;
    private String price;
    public CartModel() {
    }
    public CartModel(String cartItemId, UserModel userId, String productName, int quantity, String price) {
        this.cartItemId = cartItemId;
        this.userId = userId;
        ProductName = productName;
        Quantity = quantity;
        this.price = price;
    }
    public String getCartItemId() {
        return cartItemId;
    }
    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
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
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}