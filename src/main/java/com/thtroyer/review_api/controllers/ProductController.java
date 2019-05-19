package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Product;
import com.thtroyer.review_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getProductList() {
        //@todo
        return Collections.emptyList();
    }

    @PostMapping("/product")
    public void addProduct() {
        //@todo
    }
}
