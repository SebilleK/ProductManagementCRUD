package com.sebillek.products.controller;


import com.sebillek.products.entity.Product;
import com.sebillek.products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    /* Welcome endpoint */
    @GetMapping("/info")
    public String welcomeMessage() {
        return "Welcome to the Products Management API. Everything seems to be working =)";
    }

    /* POST */
    @PostMapping("/product/add")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/product/addlist")
    public List<Product> saveProductList (@RequestBody List<Product> products) {
        return service.saveProductList(products);
    }

    /* GET */

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getAllProducts();

    }

    @GetMapping("/product/id/{id}")
    public Product findProductById (@PathVariable int id) {
        return service.getProductbyId(id);
    }

    @GetMapping("/product/name/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductbyName(name);
    }

    /* UPDATE */

    @PutMapping("/product/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    /* DELETE */
    @DeleteMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}
