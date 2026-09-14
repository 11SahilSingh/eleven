package com.example.eleven_backend.repository;

import com.example.eleven_backend.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Product SET productTitle = :productTitle, productDescription = :productDescription, productPrice = :productPrice, productStock = :productStock, productBrand = :productBrand, productSize = :productSize, productColour = :productColour, imageUrl = :imageUrl, categoryFkId = :categoryFkId WHERE productPkId = :productPkId", nativeQuery = true)
    Integer updateProduct(
            @Param("productPkId") Integer productPkId,
            @Param("productTitle") String productTitle,
            @Param("productDescription") String productDescription,
            @Param("productPrice") Integer productPrice,
            @Param("productStock") Integer productStock,
            @Param("productBrand") String productBrand,
            @Param("productSize") String productSize,
            @Param("productColour") String productColour,
            @Param("imageUrl") String imageUrl,
            @Param("categoryFkId") Integer categoryFkId
    );
}
