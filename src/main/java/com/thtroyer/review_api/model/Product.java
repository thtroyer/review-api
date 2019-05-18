package com.thtroyer.review_api.model;

public class Product {
    private String brand;
    private String name;
    private String description;

    public Product(String brand, String name, String description) {
        this.brand = brand;
        this.name = name;
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
