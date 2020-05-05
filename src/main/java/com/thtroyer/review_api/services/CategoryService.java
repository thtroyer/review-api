package com.thtroyer.review_api.services;

import com.thtroyer.review_api.model.Category;
import com.thtroyer.review_api.repository.CategoryRepository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    public void addCategory(@RequestBody Category category) {
        categoryRepository.save(category);
    }
}
