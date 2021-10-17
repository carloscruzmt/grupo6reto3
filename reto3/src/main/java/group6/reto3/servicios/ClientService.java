package group6.reto3.servicios;

import group6.reto3.modelo.Client;
import group6.reto3.repositorios.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PosYo
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getAll() {
        return clientRepository.getAll();
    }
    
    public Client save(Client client) {
        return clientRepository.save(client);
    }
    
    public Client getById(int id) {
        Optional<Client> client = clientRepository.getById(id);
        return client.orElse(new Client());
    }
    
}