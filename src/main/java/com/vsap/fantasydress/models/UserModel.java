package com.vsap.fantasydress.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "usermodel")
public class UserModel {
    @Id
    @GeneratedValue
    private Integer userId;
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private Boolean active;
    private String role;
    @OneToOne(cascade = CascadeType.ALL)
    private CartModel cart;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "userId")
    private List<OrderModel> ordersList;


    public UserModel() {

    }

    public UserModel(String email, String password, String username, String mobileNumber) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.mobileNumber = mobileNumber;
        ordersList=new ArrayList<>();
    }


    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public CartModel getCart() {
        return cart;
    }
    public List<OrderModel> getOrdersList() {
        return ordersList;
    }
    
}