package com.cruznobre.api.core.service;

import com.cruznobre.api.core.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository repository;

    public ClientService(ClientRepository repository){
        this.repository = repository;
    }
    
}
