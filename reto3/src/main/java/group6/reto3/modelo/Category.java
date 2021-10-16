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
 *
 * @author Grupo 6
 */
@Entity
@Table(name = "categorias")
public class Category {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombre;
    private String descripcion;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "categoria")
    @JsonIgnoreProperties("categoria")
    private List<Computer> computadores;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Computer> getComputadores() {
        return computadores;
    }

    public void setComputadores(List<Computer> computadores) {
        this.computadores = computadores;
    }
    
}
