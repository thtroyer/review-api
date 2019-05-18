package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CategoryController {
    @GetMapping("/category")
    public List<Category> getCategoryList() {
        //@todo
        return Collections.emptyList();
    }

    @PostMapping("/category")
    public void addCategory() {
        //@todo
    }

}
