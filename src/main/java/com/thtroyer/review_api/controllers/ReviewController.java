package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Category;
import com.thtroyer.review_api.model.Product;
import com.thtroyer.review_api.model.Review;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReviewController {
    @GetMapping(value = {"/", "/review"})
    public String index() {
        return "Hello, world!";
    }

    @GetMapping("/review/{id}")
    @ResponseBody
    public Review getReviewById(@PathVariable Integer id) {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("food"));
        categories.add(new Category("pizza"));

        Review test = new Review(
                1,
                6,
                "Meh",
                new Product("Jack's", "Pepperoni Pizza", "Thin Crust"),
                categories
        );

        return test;
    }
}
