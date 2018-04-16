package com.personal.challenge.aledev.Endpoint;


import com.personal.challenge.aledev.model.Cliente;
import com.personal.challenge.aledev.service.ValidarClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValidarClienteController {

    private ValidarClienteService validarClienteService;


    @Autowired
    public ValidarClienteController(ValidarClienteService validarClienteService){this.validarClienteService = validarClienteService; }

    @PostMapping("/")
    public List<Cliente> method(){
        return null;
    }



}
