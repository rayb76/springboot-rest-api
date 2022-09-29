package com.ITserviceclients;

import org.springframework.beans.factory.annotation.Autowired;


import com.ITserviceclients.ClientController;
import com.ITserviceclients.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    public ClientRepository clientRepository;

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        clientRepository.findAll().forEach(clients::add);
        return clients;

    }

    public void addClient(Client client){
        clientRepository.save(client);
    }

    public void updateClient(Long id, Client client){
        clientRepository.save(client);
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }



}
