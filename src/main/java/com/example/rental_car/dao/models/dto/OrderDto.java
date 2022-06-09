package com.example.rental_car.dao.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfIssue;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;

    private int id_car;

    public OrderDto(int id_car) {
        this.id_car = id_car;
    }
}
