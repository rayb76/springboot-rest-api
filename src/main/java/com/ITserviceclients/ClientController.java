package com.ITserviceclients;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(path="/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();

    }

    @RequestMapping(method= RequestMethod.POST, value="/clients")
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/clients/{id}")
    public void updateClient(@PathVariable Long id, @RequestBody Client client){
        clientService.updateClient(id, client);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/clients/{id}")
    public void deleteClient(@PathVariable Long id, Client client){
        clientService.deleteClient(id);
    }

}
