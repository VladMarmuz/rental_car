package com.example.rental_car.service;

import com.example.rental_car.dao.models.Car;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CarService {
    List<Car> findAllCar();
    void save(Car car);
    void deleteById(Integer id);


}
