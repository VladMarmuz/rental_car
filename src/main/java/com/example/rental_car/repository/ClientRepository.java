package com.example.rental_car.repository;

import com.example.rental_car.models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer> {
    Client findClientByUsername(String userName);// найти человека по username
    List<Client> findAll();
    void deleteById(Integer id);
}
