package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.OrderItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderItemRepo extends JpaRepository<OrderItem,Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE OrderItem SET orderFkId = :orderFkId, productFkId = :productFkId, quantity = :quantity, price = :price WHERE orderItemPkId = :orderItemPkId", nativeQuery = true)
    Integer updateOrderItem(
            @Param("orderItemPkId") Integer orderItemPkId,
            @Param("orderFkId") Integer orderFkId,
            @Param("productFkId") Integer productFkId,
            @Param("quantity") Integer quantity,
            @Param("price") Integer price
    );

}
