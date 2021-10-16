package group6.reto3.repositorios;

import group6.reto3.modelo.Computer;
import group6.reto3.repositorios.crud.ComputerCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Grupo 6
 */
@Repository
public class ComputerRepository {
    
    @Autowired
    private ComputerCrudRepository repoComputer;
    
    public List<Computer> getAll() {
        return (List<Computer>) repoComputer.findAll();
    }
    
    public List<Computer> getByIdCategory(int idCategory) {
        return (List<Computer>) repoComputer.findByIdCategoryOrderByNombreAsc(idCategory);
    }
    
    public Computer save(Computer computer) {
        return repoComputer.save(computer);
    }
    
    public Optional<Computer> getById(int id) {
        return repoComputer.findById(id);
    }
    
}
