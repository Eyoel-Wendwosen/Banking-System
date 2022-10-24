package com.feleke.eyoel.bankingsystem.services;

import com.feleke.eyoel.bankingsystem.models.Client;
import com.feleke.eyoel.bankingsystem.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        List<Client> clients = clientRepository.findAll().stream().map(user -> (Client) user).collect(Collectors.toList());
        return clients;
    }

    public Client getClientById(Long id) {
        Client client = (Client) clientRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException(String.format("Client with id: %d can not be found", id));

        });
        return client;
    }

    @Transactional
    public Client updateClientById(Long id, Client updateClient) {
        Client existingClient = (Client) clientRepository
                .findById(id)
                .orElseThrow(() -> {
                    throw new RuntimeException(String.format("Client with id: %d can not be found", id));
                });

        if (!updateClient.getEmail().equals(existingClient.getEmail()) &&
                clientRepository.findUserByEmail(updateClient.getEmail()).isPresent()) {
            throw new RuntimeException("Client with the same email exists");
        }

        if (updateClient.getEmail() != null) existingClient.setEmail(updateClient.getEmail());
        if (updateClient.getPhone() != null) existingClient.setPhone(updateClient.getPhone());
        if (updateClient.getName() != null) existingClient.setName(updateClient.getName());
        if (updateClient.getDateOfBirth() != null) existingClient.setDateOfBirth(updateClient.getDateOfBirth());

        return existingClient;
    }

    public Client createClient(Client client) {
        if (clientRepository.findUserByEmail(client.getEmail()).isPresent()) {
            throw new RuntimeException("Client with the same email exists");
        }
        Client newClient = clientRepository.save(client);
        return newClient;
    }
}
