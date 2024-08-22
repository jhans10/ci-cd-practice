package com.example.demo.client.service;

import com.example.demo.client.model.Client;

import java.util.List;

public interface IServiceClient {

    public List<Client> getClients();

    public void deleteClient(Long id);

    public Client saveClient(Client client);

    public Client updateClient(Client client);

    public Client findById(Long id);


}
