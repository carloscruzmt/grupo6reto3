package group6.reto3.servicios;

import group6.reto3.modelo.Computer;
import group6.reto3.repositorios.ComputerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo 6
 */
@Service
public class ComputerService {
    
    @Autowired
    private ComputerRepository computerRepository;
    
    public List<Computer> getAll() {
        return computerRepository.getAll();
    }
    
    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }
    
    public Computer getById(int id) {
        Optional<Computer> computer = computerRepository.getById(id);
        return computer.orElse(new Computer());
    }
    
}
