package com.example.rental_car.service;

import com.example.rental_car.models.Car;
import java.util.List;

public interface CarService {
    List<Car> findAllCar();
    void save(Car car);
    void deleteById(Integer id);


}
