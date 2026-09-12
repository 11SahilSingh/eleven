package com.example.eleven_backend.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cartPkId;

    Integer userFkId;

    LocalDateTime createdDate;

    public Integer getCartPkId() {
        return cartPkId;
    }

    public void setCartPkId(Integer cartPkId) {
        this.cartPkId = cartPkId;
    }

    public Integer getUserFkId() {
        return userFkId;
    }

    public void setUserFkId(Integer userFkId) {
        this.userFkId = userFkId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
