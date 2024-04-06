package hn.unah.lenguajes1900.examen2.demo5.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen2.demo5.entities.Clientes;
import hn.unah.lenguajes1900.examen2.demo5.repositories.ClientesRepository;
import hn.unah.lenguajes1900.examen2.demo5.services.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    private ClientesRepository clientesRepository;
    
    @Override
    public Clientes crearClientes(Clientes cliente) {
        if(this.clientesRepository.findById(cliente.getDni()).isPresent()){
            return null;
        }
        
        return this.clientesRepository.save(cliente);
    }
    
}
