package com.example.rental_car.service;

import com.example.rental_car.dao.models.Order;
import com.example.rental_car.dao.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl1 implements Order1Service{

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl1(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Override
    public void save(Order order) {
        orderRepository.save(order);
    }
}
