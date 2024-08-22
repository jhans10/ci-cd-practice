package com.example.demo.client.service;

import com.example.demo.client.model.Client;
import com.example.demo.client.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceClient implements IServiceClient{


    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<Client> getClients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {

        Client client1 = clientRepository.findById(client.getId()).get();
        client1.setAge(client.getAge());
        client1.setName(client.getName());
        client1.setLastName(client.getLastName());


        return clientRepository.save(client1);
    }


    @Override
    public Client findById(Long id){
        return clientRepository.findById(id).get();
    }
}
