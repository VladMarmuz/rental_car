package com.example.rental_car.service;

import com.example.rental_car.models.Order;
import com.example.rental_car.models.dto.OrderDto;

import java.util.List;

public interface OrderService {
    void save(OrderDto order);
    List<Order> findAllOrder();
    void deleteById(Integer id);
    Order findOrderById(Integer id);
}
