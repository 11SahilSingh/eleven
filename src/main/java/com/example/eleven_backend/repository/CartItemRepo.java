package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.Cart;
import com.example.eleven_backend.entity.CartItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CartItemRepo extends JpaRepository<CartItem,Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE CartItem SET cartFkId = :cartFkId, productFkId = :productFkId, quantity = :quantity WHERE cartItemPkId = :cartItemPkId", nativeQuery = true)
    Integer updateCartItem(
            @Param("cartItemPkId") Integer cartItemPkId,
            @Param("cartFkId") Integer cartFkId,
            @Param("productFkId") Integer productFkId,
            @Param("quantity") Integer quantity
    );

}
