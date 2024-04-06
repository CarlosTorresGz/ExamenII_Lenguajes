package hn.unah.lenguajes1900.examen2.demo5.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {
    
    @Id
    @Column(name = "numerocuenta")
    private String numeroCuenta;

    private double saldo;

    @Column(name = "fechaapertura")
    private LocalDate fechaApertura;

    private byte estado;

    private byte sobregiro;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Clientes cliente;

    @JsonManagedReference
    @OneToMany(mappedBy = "cuenta")
    private List<Movimientos> movimientos;

}
