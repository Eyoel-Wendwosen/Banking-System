package com.feleke.eyoel.bankingsystem.controllers;

import com.feleke.eyoel.bankingsystem.models.Client;
import com.feleke.eyoel.bankingsystem.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping({"/", ""})
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{client_id}")
    public Client getClientById(@PathVariable Long client_id) {
        return clientService.getClientById(client_id);
    }

    @PostMapping({"/", ""})
    public Client createClient(@RequestBody Client client) {
        return clientService.createClient(client);
    }

    @PutMapping("/{client_id}")
    public Client updateClient(@PathVariable Long client_id, @RequestBody Client client) {
        return clientService.updateClientById(client_id, client);
    }
}
