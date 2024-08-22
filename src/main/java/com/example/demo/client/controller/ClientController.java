package com.example.demo.client.controller;

import com.example.demo.client.model.Client;
import com.example.demo.client.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/client-controller")
public class ClientController {

    @Autowired
    private IServiceClient iServiceClient;

    @GetMapping("/get-clients")
    public ResponseEntity<?> getClients(){
        return ResponseEntity.of(Optional.ofNullable(iServiceClient.getClients()));
    }

    @GetMapping("/find-client-by-id/{id}")
    public ResponseEntity<?> findClientById(@PathVariable  Long id){
        return ResponseEntity.of(Optional.ofNullable(iServiceClient.findById(id)));
    }

    @PostMapping("/save-client")
    public ResponseEntity<?> saveClient(@RequestBody Client client){
        return ResponseEntity.of(Optional.ofNullable(iServiceClient.saveClient(client)));
    }

    @PutMapping("/update-client")
    public ResponseEntity<?> updateClient(@RequestBody Client client){
        return ResponseEntity.of(Optional.ofNullable(iServiceClient.updateClient(client)));
    }

    @DeleteMapping("/delete-client/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Long id){
        iServiceClient.deleteClient(id);
        return ResponseEntity.ok(200);
    }





}
