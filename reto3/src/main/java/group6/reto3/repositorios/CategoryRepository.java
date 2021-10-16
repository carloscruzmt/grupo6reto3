package group6.reto3.repositorios;

import group6.reto3.modelo.Category;
import group6.reto3.repositorios.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Grupo 6
 */
@Repository
public class CategoryRepository {
    
    @Autowired
    private CategoryCrudRepository repoCategory;
    
    public List<Category> getAll() {
        return (List<Category>) repoCategory.findAll();
    }
    
    public Category save(Category category) {
        return repoCategory.save(category);
    }
    
    public Optional<Category> getById(int id) {
        return repoCategory.findById(id);
    }
    
}
