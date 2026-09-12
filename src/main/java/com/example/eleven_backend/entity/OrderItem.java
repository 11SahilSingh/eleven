package com.example.eleven_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="OrderItem")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderItemPkId;

    Integer orderFkId;

    Integer productFkId;

    Integer quantity;

    Integer price;

    public Integer getOrderItemPkId() {
        return orderItemPkId;
    }

    public void setOrderItemPkId(Integer orderItemPkId) {
        this.orderItemPkId = orderItemPkId;
    }

    public Integer getOrderFkId() {
        return orderFkId;
    }

    public void setOrderFkId(Integer orderFkId) {
        this.orderFkId = orderFkId;
    }

    public Integer getProductFkId() {
        return productFkId;
    }

    public void setProductFkId(Integer productFkId) {
        this.productFkId = productFkId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
