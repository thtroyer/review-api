package com.thtroyer.review_api.model;

public class Category {
    private int id;
    private String name;

    public Category(int id, String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
