package com.validar.cliente.bs_validar_cliente.service;

import com.validar.cliente.bs_validar_cliente.model.Cliente;

public interface ValidarClienteService {
    String registerCliente(Cliente cliente);
    boolean putClientIntoMessageBus(Cliente cliente);
}
