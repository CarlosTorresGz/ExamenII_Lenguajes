package hn.unah.lenguajes1900.examen2.demo5.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Clientes {

    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;    

    @JsonIgnore
    @OneToOne(mappedBy = "cliente")
    private Direcciones direccion;

    @JsonManagedReference
    @OneToMany(mappedBy = "cliente")
    private List<Cuentas> cuentas;
}
