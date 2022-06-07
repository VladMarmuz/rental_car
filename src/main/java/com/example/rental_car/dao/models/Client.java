package com.example.rental_car.dao.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client extends BaseEntity {


    @Column(name = "surname", length = 45)
    private String surname;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "patronymic", length = 45)
    private String patronymic;

    @Column(name = "number_of_passport", length = 45)
    private String numberOfPassport;

    @Column(name = "telephone", length = 45)
    private String telephone;

    @Column(name = "address", length = 60)
    private String address;

    @Column(name = "driving_experience")
    private Integer drivingExperience;

    @Enumerated(EnumType.STRING)//эта запись обозначает ,что наши записи в Enum будут иметь тип String
    private Role role;

    @Column(unique = true)
    private String username;

    @Column(name = "password")
    //@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$", message = "Пароль должен содержать 1 цифру и одно заглавную букву,только латинские буквы,")
    private String password;

    @OneToMany(mappedBy = "idClient")
    private List<Order> ordersClient;//это в client


    @Override
    public String toString() {
        return "Client{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", numberOfPassport='" + numberOfPassport + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", role=" + role +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ordersClient=" + ordersClient +
                '}';
    }
}