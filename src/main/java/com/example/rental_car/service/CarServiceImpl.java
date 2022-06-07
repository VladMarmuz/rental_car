package com.example.rental_car.service;

import com.example.rental_car.dao.models.Car;
import com.example.rental_car.dao.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> findAllCar() {
        return carRepository.findAll();
    }

    @Override
    public void save(Car car) {
        carRepository.save(car);

    }
}
