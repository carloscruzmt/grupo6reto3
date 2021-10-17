package group6.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase categoria
 * @author Grupo 6
 */
@Entity // @Entity esto determina que lo va a utilizar springboot, se va a utilizar esta clase Java como una tabla de base de datos
@Table(name = "categorias")  // @Table le da el nombre de la tabla en la base de datos que se creará
public class Category {
    
    @Id    // @Id marca este atributo como la llave principal de esta tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;   
    private String name;
    private String description;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category") // **atributo de la clase a relacionar (se crea en la otra clase)
    @JsonIgnoreProperties("category")  // **para que no entre en un ciclo - nombre de la tabla mapped  (el nombre del objeto en la otra clase)
    private List<Computer> computers;  //  *objeto a relacionar. El nombre del atributo en postman lo da el getter y setter 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Computer> getComputers() {
        return computers;
    }

    public void setComputers(List<Computer> computers) {
        this.computers = computers;
    }
   
}
