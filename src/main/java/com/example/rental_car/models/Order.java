package com.example.rental_car.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "`order`")
public class Order extends BaseEntity {

    @Column(name = "date_of_issue")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfIssue;

    @Column(name = "return_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;

    @Column(name= "request_state")
    private String requestState;

    @ManyToOne
    @JoinColumn(name = "id_car")//указываем поле ,которое явл ключом
    private Car idCar;// указываем к какой таблице относится зависимость

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client idClient;


}