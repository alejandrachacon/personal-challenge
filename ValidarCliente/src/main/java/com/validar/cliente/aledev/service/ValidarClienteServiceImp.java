package com.validar.cliente.aledev.service;

import com.validar.cliente.aledev.DTO.ClienteDTO;
import com.validar.cliente.aledev.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ValidarClienteServiceImp implements ValidarClienteService {

    @Value("${endpoint.url}")
    private String url;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String registerCliente(ClienteDTO clienteDTO) {
        restTemplate.postForEntity(url,"jkasdbas",String.class);
        System.out.println("client registered in Validar cliente service implementation");
        return null;
    }




}
