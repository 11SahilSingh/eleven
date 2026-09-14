package com.example.eleven_backend.controller;

import com.example.eleven_backend.entity.*;
import com.example.eleven_backend.service.IndivisualService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/indivisualController")
public class IndivisualController {

    private final IndivisualService indivisualService;

    IndivisualController(IndivisualService indivisualService){
        this.indivisualService=indivisualService;
    }


    @PostMapping("/postUser")
    public User postUser(@RequestBody User user){
        return indivisualService.postUser(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser(@RequestParam Integer userPkId){
        return indivisualService.getUser(userPkId);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam Integer userPkId){
        indivisualService.deleteUser(userPkId);
    }

    @PutMapping("/updateUserData")
    public Integer updateUserData(@RequestBody User user){
        return indivisualService.updateUserData(user);
    }



    @PostMapping("/postCategory")
    public Category postCategory(@RequestBody Category category){
        return indivisualService.postCategory(category);
    }

    @GetMapping("/getCategory")
    public List<Category> getCategory(@RequestParam Integer categoryPkId){
        return indivisualService.getCategory(categoryPkId);
    }

    @DeleteMapping("/deleteCategory")
    public void deleteCategory(@RequestParam Integer categoryPkId){
        indivisualService.deleteCategory(categoryPkId);
    }

    @PutMapping("/updateCategory")
    public Integer updateCategory(@RequestBody Category category){
        return indivisualService.updateCategory(category);
    }



    @PostMapping("/postProduct")
    public Product postProduct(@RequestBody Product product){
        return indivisualService.postProduct(product);
    }

    @GetMapping("/getProduct")
    public List<Product> getProduct(@RequestParam Integer productPkId){
        return indivisualService.getProduct(productPkId);
    }

    @DeleteMapping("/deleteProduct")
    public void deleteProduct(@RequestParam Integer productPkId){
        indivisualService.deleteProduct(productPkId);
    }

    @PutMapping("/updateProduct")
    public Integer updateProduct(@RequestBody Product product){
        return indivisualService.updateProduct(product);
    }

    @PostMapping("/postCart")
    public Cart postCart(@RequestBody Cart cart){
        return indivisualService.postCart(cart);
    }

    @GetMapping("/getCart")
    public List<Cart> getCart(@RequestParam Integer cartPkId){
        return indivisualService.getCart(cartPkId);
    }

    @DeleteMapping("/deleteCart")
    public void deleteCart(@RequestParam Integer cartPkId){
        indivisualService.deleteCart(cartPkId);
    }

    @PutMapping("/updateCart")
    public Integer updateCart(@RequestBody Cart cart){
        return indivisualService.updateCart(cart);
    }

    @PostMapping("/postCartItem")
    public CartItem postCartItem(@RequestBody CartItem cartItem){
        return indivisualService.postCartItem(cartItem);
    }

    @GetMapping("/getCartItem")
    public List<CartItem> getCartItem(@RequestParam Integer cartItemPkId){
        return indivisualService.getCartItem(cartItemPkId);
    }

    @DeleteMapping("/deleteCartItem")
    public void deleteCartItem(@RequestParam Integer cartItemPkId){
        indivisualService.deleteCartItem(cartItemPkId);
    }

    @PutMapping("/updateCartItem")
    public Integer updateCartItem(@RequestBody CartItem cartItem){
        return indivisualService.updateCartItem(cartItem);
    }


    @PostMapping("/postOrder")
    public Order postOrder(@RequestBody Order order){
        return indivisualService.postOrder(order);
    }

    @GetMapping("/getOrder")
    public List<Order> getOrder(@RequestParam Integer orderPkId){
        return indivisualService.getOrder(orderPkId);
    }

    @DeleteMapping("/deleteOrder")
    public void deleteOrder(@RequestParam Integer orderPkId){
        indivisualService.deleteOrder(orderPkId);
    }

    @PutMapping("/updateOrder")
    public Integer updateOrder(@RequestBody Order order){
        return indivisualService.updateOrder(order);
    }


    @PostMapping("/postOrderItem")
    public OrderItem postOrderItem(@RequestBody OrderItem orderItem){
        return indivisualService.postOrderItem(orderItem);
    }

    @GetMapping("/getOrderItem")
    public List<OrderItem> getOrderItem(@RequestParam Integer orderItemPkId){
        return indivisualService.getOrderItem(orderItemPkId);
    }

    @DeleteMapping("/deleteOrderItem")
    public void deleteOrderItem(@RequestParam Integer orderItemPkId){
        indivisualService.deleteOrderItem(orderItemPkId);
    }

    @PutMapping("/updateOrderItem")
    public Integer updateOrderItem(@RequestBody OrderItem orderItem){
        return indivisualService.updateOrderItem(orderItem);
    }




}
