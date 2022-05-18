package com.cruznobre.api.core.service;

import com.cruznobre.api.core.entity.Client;
import com.cruznobre.api.core.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository){
        this.repository = repository;
    }

    public List<Client> listAll() {
        return repository.findAll();
    }

    public Client save(Client client) {
        return repository.save(client);
    }
}
