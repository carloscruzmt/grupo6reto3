package group6.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Grupo 6
 */
@Entity
@Table(name = "computadores")
public class Computer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String marca;
    private String nombre;
    private Integer anio;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties("computadores")
    private Category categoria;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "computador")
    @JsonIgnoreProperties("computador")
    private List<Message> mensaje;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }

    public List<Message> getMensaje() {
        return mensaje;
    }

    public void setMensaje(List<Message> mensaje) {
        this.mensaje = mensaje;
    }

    
}
