package com.example.eleven_backend.service;

import com.example.eleven_backend.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IndivisualService {
    User postUser(User user);

    List<User> getUser(Integer userPkId);

    void deleteUser(Integer userPkId);

    Integer updateUserData(User user);

    Category postCategory(Category category);

    List<Category> getCategory(Integer categoryPkId);

    void deleteCategory(Integer categoryPkId);

    Integer updateCategory(Category category);

    Product postProduct(Product product);

    List<Product> getProduct(Integer productPkId);

    void deleteProduct(Integer productPkId);

    Integer updateProduct(Product product);

    Cart postCart(Cart cart);

    List<Cart> getCart(Integer cartPkId);

    void deleteCart(Integer cartPkId);

    Integer updateCart(Cart cart);

    CartItem postCartItem(CartItem cartItem);

    List<CartItem> getCartItem(Integer cartItemPkId);

    void deleteCartItem(Integer cartItemPkId);

    Integer updateCartItem(CartItem cartItem);

    Order postOrder(Order order);

    List<Order> getOrder(Integer orderPkId);

    void deleteOrder(Integer orderPkId);

    Integer updateOrder(Order order);

    OrderItem postOrderItem(OrderItem orderItem);

    List<OrderItem> getOrderItem(Integer orderItemPkId);

    void deleteOrderItem(Integer orderItemPkId);

    Integer updateOrderItem(OrderItem orderItem);
}
