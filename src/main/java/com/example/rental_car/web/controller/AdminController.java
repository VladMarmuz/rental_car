package com.example.rental_car.web.controller;

import com.example.rental_car.dao.models.Client;
import com.example.rental_car.service.ClientService;
import com.example.rental_car.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    private final ClientService clientService;
    private final OrderService orderService;

    public AdminController(ClientService clientService, OrderService orderService) {
        this.clientService = clientService;
        this.orderService = orderService;
    }

    @GetMapping("/admin")
    public String allClients(Model model) {
        model.addAttribute("clients", clientService.findAllClient());
        model.addAttribute("orders", orderService.findAllOrder());
        return "adminPage";
    }

    @GetMapping("/clientEdit/{id}")
    public String editClient(@PathVariable("id") Integer id,Model model){
        Client client= clientService.findClientById(id);
        model.addAttribute("client",client);
        return "clientEdit";
    }

    @PostMapping("/clientEdit")
    public String updateClient(Client client){
        clientService.save(client);
        return "redirect:/admin";
    }

    @GetMapping("/clientDelete/{id}")
    public String deleteClient(@PathVariable("id") Integer id){
        clientService.deleteById(id);
        return "redirect:/admin";
    }
}