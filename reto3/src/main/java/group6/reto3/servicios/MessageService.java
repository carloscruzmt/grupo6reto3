package group6.reto3.servicios;

import group6.reto3.modelo.Message;
import group6.reto3.repositorios.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Clase servicio mensaje
 * @author Grupo 6
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository repo;
    
    public List<Message> getAll() {
        return repo.getAll();
    }
    
    public Message save(Message message) {
        return repo.save(message);
    }   
    
    public Message getById(int id) {
        Optional<Message> message = repo.getById(id);
        return message.orElse(new Message());
    }    
       
}