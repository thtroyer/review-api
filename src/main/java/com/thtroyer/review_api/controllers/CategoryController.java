package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Category;
import com.thtroyer.review_api.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/category")
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    @PostMapping("/category")
    public void addCategory(@RequestBody Category category) {
        categoryRepository.save(category);
    }
}
