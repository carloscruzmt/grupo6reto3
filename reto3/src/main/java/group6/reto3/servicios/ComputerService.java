/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group6.reto3.servicios;

import group6.reto3.modelo.Computer;
import group6.reto3.repositorios.ComputerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nancy Jiménez
 */
@Service
public class ComputerService {
    @Autowired
    private ComputerRepository metodosCrud;
    
    public List<Computer> getAll(){
        return metodosCrud.getAll();
    }
    
    public Computer getById(int id){
        Optional<Computer> computer = metodosCrud.getById(id);
        return computer.orElse(new Computer());
    }
 
    public Computer save(Computer computer){
        return metodosCrud.save(computer);
    }
    
    //public Optional<Computer> getComputer(int id){
    //    return metodosCrud.getComputer(id);
    //}
    
    //public Computer save(Computer computer){
    //    if(computer.getId()==null){
    //        return metodosCrud.save(computer);
    //    }else{
    //        Optional<Computer> evento=metodosCrud.getComputer(computer.getId());
    //        if(evento.isEmpty()){
    //            return metodosCrud.save(computer);
    //        }else{
    //            return computer;
    //        }
    //    }
    //}
    
}
