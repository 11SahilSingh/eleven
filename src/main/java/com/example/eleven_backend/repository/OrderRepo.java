package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.Order;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface OrderRepo extends JpaRepository<Order,Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE `Order` SET userFkId = :userFkId, totalAmount = :totalAmount, orderStatus = :orderStatus, orderDate = :orderDate WHERE orderPkId = :orderPkId", nativeQuery = true)
    Integer updateOrder(
            @Param("orderPkId") Integer orderPkId,
            @Param("userFkId") Integer userFkId,
            @Param("totalAmount") Integer totalAmount,
            @Param("orderStatus") Boolean orderStatus,
            @Param("orderDate") LocalDateTime orderDate
    );

}
