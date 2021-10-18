/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package group6.reto3.repositorios.crud;

import group6.reto3.modelo.Computer;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



/**
 *
 * @author Nancy Jiménez
 */
public interface ComputerCrudRepository extends CrudRepository<Computer, Integer>{
        @Query(value="select * from computer where categoria_id = ? order by nombre ASC", nativeQuery = true)
    public List<Computer> findByIdCategoriaOrderByNombreAsc(int idCategoria);
}
