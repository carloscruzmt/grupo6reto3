package group6.reto3;

import group6.reto3.modelo.Category;
import group6.reto3.modelo.Client;
import group6.reto3.modelo.Computer;
import group6.reto3.repositorios.CategoryRepository;

import group6.reto3.repositorios.ComputerRepository;
import group6.reto3.repositorios.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"group6.reto3"})
public class Reto3Application {

    @Autowired
    private ComputerRepository repoComputer;
    @Autowired
    private CategoryRepository repoCategory;
//    @Autowired
//    private ClientRepository repoClient;
//    @Autowired
//    private MessageRepository repoMessage;

    public static void main(String[] args) {
        SpringApplication.run(Reto3Application.class, args);
    }
    
    @Bean
    ApplicationRunner applicationRunner() {
        return args -> {
            
            List<Computer> cm = repoComputer.getAll();
            System.out.println("Computadores: " + cm.size());
            
            List<Category> ct = repoCategory.getAll();
            System.out.println("Categorias: " + ct.size());
                       
//            List<Client> cl = repoClient.getAll();
//            System.out.println("Clientes: " + cl.size());
        };
    }

}
