package com.example.rental_car.dao.repository;

import com.example.rental_car.dao.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer> {
    List<Order> findAll();
    void deleteById(Integer id);

}
