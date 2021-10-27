package group6.reto3.repositorios;

import group6.reto3.modelo.Message;
import group6.reto3.repositorios.crud.MessageCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Clase repositorio mensaje
 * @author Grupo 6
 */
@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository repo;
    
    public List<Message> getAll(){
        return (List<Message>) repo.findAll();
    }
    
    public Message save(Message message) {
        return repo.save(message);
    }
    
    public Optional<Message> getById(int id) {
        return repo.findById(id);
    
    }
}
