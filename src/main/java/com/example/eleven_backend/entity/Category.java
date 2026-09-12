package com.example.eleven_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer categoryPkId;

    String categoryName;

    String description;

    public Integer getCategoryPkId() {
        return categoryPkId;
    }

    public void setCategoryPkId(Integer categoryPkId) {
        this.categoryPkId = categoryPkId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
