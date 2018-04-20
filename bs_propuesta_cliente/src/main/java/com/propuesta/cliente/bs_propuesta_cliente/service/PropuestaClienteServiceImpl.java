package com.propuesta.cliente.bs_propuesta_cliente.service;

import com.propuesta.cliente.bs_propuesta_cliente.repository.PropuestaClienteRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PropuestaClienteServiceImpl implements PropuestaClienteService {

    private String url;

    @Autowired
    private PropuestaClienteRepository propuestaClienteRepository;

    @Autowired
    private RestTemplate restTemplate;


}
