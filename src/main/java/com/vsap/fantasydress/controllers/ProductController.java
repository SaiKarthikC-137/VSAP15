package com.vsap.fantasydress.controllers;

import java.util.List;

import javax.transaction.Transactional;

import com.vsap.fantasydress.models.ProductModel;
import com.vsap.fantasydress.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    public ProductService productService;
    @GetMapping("/admin")
    public List<ProductModel> getProduct() {
        return productService.getAllProducts();
    }

    @GetMapping("/home")
    public List<ProductModel> getHomeProduct() {
        return productService.getAllProducts();
    }

    @GetMapping("/admin/productEdit/{id}")
    public ProductModel productEditData(@PathVariable String id) {
        ProductModel product=null;
        try{
            product=productService.getByName(id).get(0);
        }
        catch(Exception e) {}
        return product;
    }

    @PostMapping("/admin/productEdit/{id}")
    public void productEditSave(@RequestBody ProductModel data,@PathVariable String id) {
        ProductModel product=productService.getByName(id).get(0);
        data.setProductId(product.getProductId());
        productService.addProduct(data);
    }

    @PostMapping("/admin/addProduct")
    public void productSave(@RequestBody ProductModel data) {
        productService.addProduct(data);
    }
    @Transactional
    @GetMapping("/admin/delete/{id}")
    public void productDelete(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}
