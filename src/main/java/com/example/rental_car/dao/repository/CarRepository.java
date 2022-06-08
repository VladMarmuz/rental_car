package com.example.rental_car.dao.repository;

import com.example.rental_car.dao.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {
    List<Car> findAll();
    void deleteById(Integer id);

}

