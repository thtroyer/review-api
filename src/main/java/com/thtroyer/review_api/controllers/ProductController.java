package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Product;
import com.thtroyer.review_api.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/product")
    public List<Product> getProductList() {
        return productRepository.findAll();
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}
