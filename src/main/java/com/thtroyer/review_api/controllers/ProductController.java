package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Product;
import com.thtroyer.review_api.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
