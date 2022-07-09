package com.example.rental_car.repository;

import com.example.rental_car.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer> {
    List<Order> findAll();
    void deleteById(Integer id);

}
