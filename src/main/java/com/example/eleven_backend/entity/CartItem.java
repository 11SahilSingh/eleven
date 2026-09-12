package com.example.eleven_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="CartItem")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cartItemPkId;

    Integer cartFkId;

    Integer productFkId;

    Integer quantity;

    public Integer getCartItemPkId() {
        return cartItemPkId;
    }

    public void setCartItemPkId(Integer cartItemPkId) {
        this.cartItemPkId = cartItemPkId;
    }

    public Integer getCartFkId() {
        return cartFkId;
    }

    public void setCartFkId(Integer cartFkId) {
        this.cartFkId = cartFkId;
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
}
