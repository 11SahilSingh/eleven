package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.Category;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Category SET categoryName = :categoryName, description = :description WHERE categoryPkId = :categoryPkId", nativeQuery = true)
    Integer updateCategory(
            @Param("categoryPkId") Integer categoryPkId,
            @Param("categoryName") String categoryName,
            @Param("description") String description
    );
}
