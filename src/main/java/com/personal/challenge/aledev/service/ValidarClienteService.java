package com.personal.challenge.aledev.service;

import com.personal.challenge.aledev.DTO.ClienteDTO;
import com.personal.challenge.aledev.model.Cliente;
import java.util.List;

public interface ValidarClienteService {
    String registerCliente(ClienteDTO clienteDTO);
    List<Cliente> getSolicitudByUser(String user);
}
