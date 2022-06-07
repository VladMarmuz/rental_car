package com.example.rental_car.dao.repository;

import com.example.rental_car.dao.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {
    Client findClientByUsername(String userName);// найти человека по username
    List<Client> findAll();
}
