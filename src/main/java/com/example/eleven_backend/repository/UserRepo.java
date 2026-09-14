package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE `User` SET userName = :userName, email = :email, password = :password, role = :role, mobile = :mobile, address = :address, createdDate = :createdDate WHERE userPkId = :userPkId", nativeQuery = true)
    Integer updateUser(
            @Param("userPkId") Integer userPkId,
            @Param("userName") String userName,
            @Param("email") String email,
            @Param("password") String password,
            @Param("role") String role,
            @Param("mobile") String mobile,
            @Param("address") String address,
            @Param("createdDate") LocalDateTime createdDate
    );
}