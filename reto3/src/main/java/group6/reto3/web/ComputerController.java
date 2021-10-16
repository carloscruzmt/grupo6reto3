package group6.reto3.web;

import group6.reto3.modelo.Computer;
import group6.reto3.servicios.ComputerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Grupo 6
 */
@RestController
@RequestMapping("/api/Computer")
public class ComputerController {
    
    @Autowired
    private ComputerService computerService;
    
    @GetMapping("/all")
    private List<Computer> getAll() {
        return computerService.getAll();
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer) {
        return computerService.save(computer);
    }
    
}
