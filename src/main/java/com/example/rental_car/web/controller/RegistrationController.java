package com.example.rental_car.web.controller;

import com.example.rental_car.models.Client;
import com.example.rental_car.models.Role;
import com.example.rental_car.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    private final ClientService clientService;

    @Autowired
    public RegistrationController(ClientService clientService) {
        this.clientService = clientService;
    }


    @ModelAttribute("client")
    public Client getEmptyUser() {
        return new Client();
    }

    @GetMapping("/register")
    public String getRegisterPage() {
        return "register";
    }

    @PostMapping("/userRegister")
    public String registerUser(@Valid Client client, Errors errors) {
        if (errors.hasErrors())
            return "register";
        client.setRole(Role.ROLE_USER);
        clientService.save(client);
        return "login";
    }
}
