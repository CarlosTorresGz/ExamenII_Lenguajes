package hn.unah.lenguajes1900.examen2.demo5.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen2.demo5.entities.Clientes;
import hn.unah.lenguajes1900.examen2.demo5.services.impl.ClientesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api")
public class ClientesController {

    @Autowired
    private ClientesServiceImpl clientesServiceImpl;

    @PostMapping("/cliente/crear")
    public Clientes crearClientes(@RequestBody Clientes cliente){
        return this.clientesServiceImpl.crearClientes(cliente);
    }
    
}
