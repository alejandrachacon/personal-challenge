package com.propuesta.cliente.bs_propuesta_cliente.endpoint;
import com.propuesta.cliente.bs_propuesta_cliente.service.PropuestaClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PropuestaClienteController {

    private PropuestaClienteService propuestaClienteService;

    @Autowired
    public PropuestaClienteController(PropuestaClienteService propuestaClienteService){
        this.propuestaClienteService = propuestaClienteService;
    }




}
