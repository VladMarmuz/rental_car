package com.example.rental_car.web.controller;

import com.example.rental_car.service.ClientService;
import com.example.rental_car.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final ClientService clientService;
    private final OrderService orderService;

    public AdminController(ClientService clientService, OrderService orderService) {
        this.clientService = clientService;
        this.orderService = orderService;
    }

    @GetMapping
    public String allClients(Model model) {
        model.addAttribute("clients", clientService.findAllClient());
        model.addAttribute("orders", orderService.findAllOrder());
        return "adminPage";
    }
}