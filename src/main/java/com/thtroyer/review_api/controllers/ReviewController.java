package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Category;
import com.thtroyer.review_api.model.Product;
import com.thtroyer.review_api.model.Review;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class ReviewController {
    @GetMapping(value = {"/", "/review"})
    public List<Review> index() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("food"));
        categories.add(new Category("pizza"));

        Review pizza1 = new Review(
                1,
                9,
                "Great for freezer pizza!",
                new Product("Homerun Pizza", "Pepperoni Pizza", "Thin Crust"),
                categories
        );
        Review pizza2 = new Review(
                2,
                6,
                "Meh",
                new Product("Jack's", "Pepperoni Pizza", "Thin Crust"),
                categories
        );

        return asList(pizza1, pizza2);
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

    @PostMapping
    public void addReview() {
        //@todo
    }
}
