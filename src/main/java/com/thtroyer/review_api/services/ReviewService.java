package com.thtroyer.review_api.services;

import com.thtroyer.review_api.model.Review;
import com.thtroyer.review_api.repository.ReviewRepository;

import java.util.List;

public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) throws Exception {
        return reviewRepository.findById(id).orElseThrow(() -> new Exception("Review not found"));
    }

    public void addReview(Review review) {
        reviewRepository.save(review);
    }
}
