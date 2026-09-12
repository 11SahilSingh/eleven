package com.example.eleven_backend.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderPkId;

    Integer userFkId;

    Integer totalAmount;

    Boolean orderStatus;

    LocalDateTime orderDate;

    public Integer getOrderPkId() {
        return orderPkId;
    }

    public void setOrderPkId(Integer orderPkId) {
        this.orderPkId = orderPkId;
    }

    public Integer getUserFkId() {
        return userFkId;
    }

    public void setUserFkId(Integer userFkId) {
        this.userFkId = userFkId;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
