package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Category;
import com.thtroyer.review_api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/category")
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    @PostMapping("/category")
    public void addCategory(@RequestBody Category category) {
        categoryRepository.save(category);
    }
}
