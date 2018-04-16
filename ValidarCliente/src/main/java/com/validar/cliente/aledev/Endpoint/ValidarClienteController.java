package com.validar.cliente.aledev.Endpoint;


import com.validar.cliente.aledev.service.ValidarClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidarClienteController {

    private ValidarClienteService validarClienteService;


    @Autowired
    public ValidarClienteController(ValidarClienteService validarClienteService){this.validarClienteService = validarClienteService; }

    @GetMapping("/method/{name}")
    public String method(@PathVariable String name){
        System.out.println("Hi " + name + ", it is working on port 8181");
        validarClienteService.registerCliente(null);
        return name;
    }



}
