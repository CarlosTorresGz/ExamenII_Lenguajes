package hn.unah.lenguajes1900.examen2.demo5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.examen2.demo5.entities.Cuentas;

@Repository
public interface CuentasRespository extends CrudRepository<Cuentas, String>{
    
}
