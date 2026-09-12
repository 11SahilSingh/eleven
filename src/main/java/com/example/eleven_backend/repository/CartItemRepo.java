package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepo extends JpaRepository<Cart,Integer> {
}
