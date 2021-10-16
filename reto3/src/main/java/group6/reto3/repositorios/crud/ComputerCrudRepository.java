package group6.reto3.repositorios.crud;

import group6.reto3.modelo.Computer;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Grupo 6
 */
public interface ComputerCrudRepository extends CrudRepository<Computer, Integer> {
    
    @Query(value = "select * from computadores where category_id = ? order by ASC", nativeQuery = true)
    public List<Computer> findByIdCategoryOrderByNombreAsc(int idCategory);
    
}