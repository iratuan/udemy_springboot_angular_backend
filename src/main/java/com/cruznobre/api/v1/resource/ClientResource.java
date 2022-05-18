package com.cruznobre.api.v1.resource;

import com.cruznobre.api.core.entity.Client;
import com.cruznobre.api.core.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientResource {

    private final ClientService service;

    @Autowired
    public ClientResource(ClientService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Client>> listAllClients() {
        List<Client> clients = this.service.listAll();
        return  ResponseEntity.ok().body(clients);

    }

    @PostMapping
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
      Client savedClient =  this.service.save(client);
      return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }

}
