/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group6.reto3.repositorios;


import group6.reto3.modelo.Computer;
import group6.reto3.repositorios.crud.ComputerCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nancy Jiménez
 */
@Repository
public class ComputerRepository {
    
    @Autowired
    private ComputerCrudRepository crud;
    
    public List<Computer> getAll(){
        return (List<Computer>) crud.findAll();
    }
    
    public List<Computer> getByIdCategory(int idCategoria){
        return (List<Computer>) crud.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    
    public Optional <Computer> getById(int id){
        return crud.findById(id);
    }
    public Computer save(Computer computer){
        return crud.save(computer);
    }
}
