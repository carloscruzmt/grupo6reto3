package group6.reto3.repositorios;

import group6.reto3.modelo.Client;
import group6.reto3.repositorios.crud.ClientCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PosYo
 */
@Repository
public class ClientRepository {
    
    @Autowired
    private ClientCrudRepository repoClient;
    
    public List<Client> getAll() {
        return (List<Client>) repoClient.findAll();
    }
    
    public Client save(Client client) {
        return repoClient.save(client);
    }
    
    public Optional<Client> getById(int id) {
        return repoClient.findById(id);
    }

}