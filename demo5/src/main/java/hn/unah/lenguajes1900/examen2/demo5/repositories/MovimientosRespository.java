package hn.unah.lenguajes1900.examen2.demo5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.examen2.demo5.entities.Movimientos;

@Repository
public interface MovimientosRespository extends CrudRepository<Movimientos, Long>{
    
}
