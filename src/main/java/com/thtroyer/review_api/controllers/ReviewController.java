package com.thtroyer.review_api.controllers;

import com.thtroyer.review_api.model.Category;
import com.thtroyer.review_api.model.Product;
import com.thtroyer.review_api.model.Review;
import com.thtroyer.review_api.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping(value = {"/", "/review"})
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @GetMapping("/review/{id}")
    @ResponseBody
    public Review getReviewById(@PathVariable Long id) throws Exception {
        return reviewRepository.findById(id).orElseThrow(()->new Exception("Review not found"));
    }

    @PostMapping
    public void addReview(@RequestBody Review review) {
        reviewRepository.save(review);
    }
}
