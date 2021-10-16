package group6.reto3.servicios;

import group6.reto3.modelo.Category;
import group6.reto3.repositorios.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Grupo 6
 */
@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
    
    public Category save(Category category) {
        return categoryRepository.save(category);
    }   
    
    public Category getById(int id) {
        Optional<Category> category = categoryRepository.getById(id);
        return category.orElse(new Category());
    }
    
}
