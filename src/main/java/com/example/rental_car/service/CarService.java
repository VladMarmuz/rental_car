package com.example.rental_car.service;

import com.example.rental_car.dao.models.Car;

import java.util.List;

public interface CarService {
    List<Car> findAllCar();
    void save(Car car);

}
