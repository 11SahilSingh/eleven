package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.Cart;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface CartRepo extends JpaRepository<Cart,Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Cart SET userFkId = :userFkId, createdDate = :createdDate WHERE cartPkId = :cartPkId", nativeQuery = true)
    Integer updateCart(
            @Param("cartPkId") Integer cartPkId,
            @Param("userFkId") Integer userFkId,
            @Param("createdDate") LocalDateTime createdDate
    );

}
