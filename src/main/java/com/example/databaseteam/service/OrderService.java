package com.example.databaseteam.service;

import com.example.databaseteam.model.Order;
import com.example.databaseteam.model.ShippingAddress;
import com.example.databaseteam.model.ShoppingCart;

import java.util.List;

public interface OrderService {
    public Order save(ShoppingCart cart, ShippingAddress shippingAddress);
    public List<Order> getAllOrder();
}
