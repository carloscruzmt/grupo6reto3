/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group6.reto3.web;

import group6.reto3.modelo.Computer;
import group6.reto3.servicios.ComputerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nancy Jiménez
 */
@RestController
@RequestMapping("/api/Computer")
@CrossOrigin (origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ComputerController {
    
    @Autowired
    private ComputerService servicios;
    
    @GetMapping("/all")
    public List<Computer> getAll(){
        return servicios.getAll();
    }
    
   // @GetMapping("/{id}")
   // public Optional<Computer> getComputer(@PathVariable("id") int id){
   //     return servicios.getComputer(id);
   // }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer){
        return servicios.save(computer);
    }
    
}
