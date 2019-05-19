package com.thtroyer.review_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "review")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = "createdAt")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer rating;

    private String notes;

    @ManyToOne
    private Product product;

    @OneToMany
    private List<Category> categories;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public Review(Long id, int rating, String notes, Product product, List<Category> categories) {
        this.id = id;
        this.rating = rating;
        this.notes = notes;
        this.product = product;
        this.categories = categories;
    }

    public Long getId() {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
