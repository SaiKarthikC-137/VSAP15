package com.vsap.fantasydress.controllers;

import java.util.List;

import javax.transaction.Transactional;

import com.vsap.fantasydress.models.CartModel;
import com.vsap.fantasydress.models.ProductModel;
import com.vsap.fantasydress.models.UserModel;
import com.vsap.fantasydress.services.CartService;
import com.vsap.fantasydress.services.LoginService;
import com.vsap.fantasydress.services.ProductService;
import com.vsap.fantasydress.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    public CartService cartService;
    @Autowired
    public ProductService productService;
    @Autowired
    public UserService userService;
    @Autowired
    public LoginService loginService;
    
    @GetMapping("/temp/{id}")
    public ProductModel getProd(@PathVariable String id) {
        return productService.getByName(id).get(0);
    }
    @GetMapping("/userdet")
    public UserModel getuserdet() {
        return userService.getUserByEmail(loginService.getUser().getEmail()).get(0);
        //return loginService.getUser();
    }
    @PostMapping("/home/{id}")
    public void addToCart(@RequestBody String quantity,@PathVariable String id) {
        ProductModel product=productService.getByName(id).get(0);
        UserModel user=userService.getUserByEmail(loginService.getUser().getEmail()).get(0);
        CartModel cart=new CartModel(user.getUserId(),product.getProductName(),Integer.parseInt(quantity),product.getPrice());
        cartService.addItem(cart);
    }
    @GetMapping("/cart/{id}")
    public List<CartModel> showCart(@PathVariable String id) {
        return cartService.getAllItems(Integer.valueOf(id));
    }
    @Transactional
    @PostMapping("/cart/delete")
    public void deleteCartItem(@RequestBody String id) {
        cartService.deleteProduct(id);
    }
}
