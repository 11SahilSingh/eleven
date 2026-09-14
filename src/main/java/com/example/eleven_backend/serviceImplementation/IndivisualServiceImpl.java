package com.example.eleven_backend.serviceImplementation;

import com.example.eleven_backend.entity.*;
import com.example.eleven_backend.exception.ResourceNotFoundException;
import com.example.eleven_backend.repository.*;
import com.example.eleven_backend.service.IndivisualService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndivisualServiceImpl implements IndivisualService {

    private final UserRepo userRepo;
    private final CategoryRepo categoryRepo;
    private final ProductRepo productRepo;
    private final CartRepo cartRepo;
    private final CartItemRepo cartItemRepo;
    private final OrderRepo orderRepo;
    private final OrderItemRepo orderItemRepo;

    public IndivisualServiceImpl(UserRepo userRepo, CategoryRepo categoryRepo, ProductRepo productRepo, CartRepo cartRepo, CartItemRepo cartItemRepo, OrderRepo orderRepo, OrderItemRepo orderItemRepo) {
        this.userRepo = userRepo;
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
        this.cartRepo = cartRepo;
        this.cartItemRepo = cartItemRepo;
        this.orderRepo = orderRepo;
        this.orderItemRepo = orderItemRepo;
    }


    @Override
    public User postUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getUser(Integer userPkId) {

        List<User> userList = new ArrayList<>();

        if(userPkId != null){
            User user = userRepo.findById(userPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("User not found with id : "+userPkId));
            userList.add(user);
        }else{
            userList=userRepo.findAll();
        }
        return userList;
    }

    @Override
    public void deleteUser(Integer userPkId) {
        if(userPkId != null){
            userRepo.deleteById(userPkId);
        }
    }

    @Override
    @Transactional
    public Integer updateUserData(User user) {
        return userRepo.updateUser(user.getUserPkId(),user.getUserName(),user.getEmail(),user.getPassword(),user.getRole(),user.getMobile(),user.getAddress(),user.getCreatedDate());
    }

    @Override
    public Category postCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public List<Category> getCategory(Integer categoryPkId) {
        List<Category> categoryList = new ArrayList<>();

        if(categoryPkId != null){
            Category category = categoryRepo.findById(categoryPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("Category not found with id : "+categoryPkId));
            categoryList.add(category);
        }else{
            categoryList=categoryRepo.findAll();
        }
        return categoryList;
    }

    @Override
    public void deleteCategory(Integer categoryPkId) {
        categoryRepo.deleteById(categoryPkId);
    }

    @Override
    public Integer updateCategory(Category category) {
        return categoryRepo.updateCategory(category.getCategoryPkId(),category.getCategoryName(),category.getDescription());
    }

    @Override
    public Product postProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getProduct(Integer productPkId) {
        List<Product> productList = new ArrayList<>();
        if(productPkId != null){
            Product product = productRepo.findById(productPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("Product not found with id : "+productPkId));
            productList.add(product);
        }else{
            productList=productRepo.findAll();
        }
        return productList;
    }

    @Override
    public void deleteProduct(Integer productPkId) {
        productRepo.deleteById(productPkId);
    }

    @Override
    public Integer updateProduct(Product product) {
        return productRepo.updateProduct(product.getProductPkId(),product.getProductTitle(),product.getProductDescription(),product.getProductPrice(),product.getProductStock(),product.getProductBrand(),product.getProductSize(),product.getProductColour(),product.getImageUrl(),product.getCategoryFkId());
    }

    @Override
    public Cart postCart(Cart cart) {
        return cartRepo.save(cart);
    }

    @Override
    public List<Cart> getCart(Integer cartPkId) {
        List<Cart> cartList = new ArrayList<>();
        if(cartPkId != null){
            Cart cart = cartRepo.findById(cartPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("Cart not found with id : "+cartPkId));
            cartList.add(cart);
        }else{
            cartList=cartRepo.findAll();
        }
        return cartList;
    }

    @Override
    public void deleteCart(Integer cartPkId) {
        cartRepo.deleteById(cartPkId);
    }

    @Override
    public Integer updateCart(Cart cart) {
        return cartRepo.updateCart(cart.getCartPkId(),cart.getUserFkId(),cart.getCreatedDate());
    }

    @Override
    public CartItem postCartItem(CartItem cartItem) {
        return cartItemRepo.save(cartItem);
    }

    @Override
    public List<CartItem> getCartItem(Integer cartItemPkId) {
        List<CartItem> cartItemList = new ArrayList<>();
        if(cartItemPkId != null){
            CartItem cartItem = cartItemRepo.findById(cartItemPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("CartItem not found with id : "+cartItemPkId));
            cartItemList.add(cartItem);
        }else{
            cartItemList=cartItemRepo.findAll();
        }
        return cartItemList;
    }

    @Override
    public void deleteCartItem(Integer cartItemPkId) {
        cartItemRepo.deleteById(cartItemPkId);
    }

    @Override
    public Integer updateCartItem(CartItem cartItem) {
        return cartItemRepo.updateCartItem(cartItem.getCartItemPkId(),cartItem.getCartFkId(),cartItem.getProductFkId(),cartItem.getQuantity());
    }

    @Override
    public Order postOrder(Order order) {
        return orderRepo.save(order);
    }

    @Override
    public List<Order> getOrder(Integer orderPkId) {
        List<Order> orderList = new ArrayList<>();
        if(orderPkId != null){
            Order order = orderRepo.findById(orderPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("Order not found with id : "+orderPkId));
            orderList.add(order);
        }else {
            orderList = orderRepo.findAll();
        }
        return orderList;
    }

    @Override
    public void deleteOrder(Integer orderPkId) {
        orderRepo.deleteById(orderPkId);
    }

    @Override
    public Integer updateOrder(Order order) {
        return orderRepo.updateOrder(order.getOrderPkId(),order.getUserFkId(),order.getTotalAmount(),order.getOrderStatus(),order.getOrderDate());
    }

    @Override
    public OrderItem postOrderItem(OrderItem orderItem) {
        return orderItemRepo.save(orderItem);
    }

    @Override
    public List<OrderItem> getOrderItem(Integer orderItemPkId) {
        List<OrderItem> orderItemList = new ArrayList<>();
        if(orderItemPkId != null){
            OrderItem orderItem = orderItemRepo.findById(orderItemPkId)
                    .orElseThrow(()-> new ResourceNotFoundException("OrderItem not found with id : "+orderItemPkId));
            orderItemList.add(orderItem);
        }else{
            orderItemList=orderItemRepo.findAll();
        }
        return orderItemList;
    }

    @Override
    public void deleteOrderItem(Integer orderItemPkId) {
        orderItemRepo.deleteById(orderItemPkId);
    }

    @Override
    public Integer updateOrderItem(OrderItem orderItem) {
        return orderItemRepo.updateOrderItem(orderItem.getOrderItemPkId(),orderItem.getOrderFkId(),orderItem.getProductFkId(),orderItem.getQuantity(),orderItem.getPrice());
    }
}
