package com.validar.cliente.bs_validar_cliente.Endpoint;


import com.validar.cliente.bs_validar_cliente.model.Cliente;
import com.validar.cliente.bs_validar_cliente.service.ValidarClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidarClienteController {

    private ValidarClienteService validarClienteService;

    public ValidarClienteController(ValidarClienteService validarClienteService){this.validarClienteService = validarClienteService; }

    @PostMapping("/request")
    public String requestConflictInterest(@RequestBody Cliente client){
        System.out.println(client.getName());
        validarClienteService.putClientIntoMessageBus(client);
        return "your request has been sent";
    }



}
