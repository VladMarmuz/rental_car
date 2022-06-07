package com.example.rental_car.dao.models;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "car")
public class Car extends BaseEntity {

    @Column(name = "brand", length = 45)
    private String brand;

    @Column(name = "model", length = 45)
    private String model;

    @Column(name = "year_of_issue")
    private Integer yearOfIssue;

    @Column(name = "number_of_registration", length = 45)
    private String numberOfRegistration;

    @Column(name = "transmission", length = 45)
    private String transmission;

    @Column(name = "`price(day)$`", precision = 10, scale = 2)
    private BigDecimal priceDay;

    @OneToMany(mappedBy = "idCar")
    private List<Order> ordersCars;// create зависимость (Один ко многим к таблице "заказ")//это в car

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", numberOfRegistration='" + numberOfRegistration + '\'' +
                ", transmission='" + transmission + '\'' +
                ", priceDay=" + priceDay +
                ", ordersCars=" + ordersCars +
                '}';
    }
}