package com.thtroyer.review_api.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Review {
    private int id;
    private int rating;
    private String notes;
    private Product product;
    private List<Category> categories;
    private LocalDateTime dateTime;

    public Review(int id, int rating, String notes, Product product, List<Category> categories) {
        this.id = id;
        this.rating = rating;
        this.notes = notes;
        this.product = product;
        this.categories = categories;
        this.dateTime = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public int getRating() {
        return rating;
    }

    public String getNotes() {
        return notes;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
