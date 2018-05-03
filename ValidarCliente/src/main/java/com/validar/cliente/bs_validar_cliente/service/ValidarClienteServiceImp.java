package com.validar.cliente.bs_validar_cliente.service;

import com.validar.cliente.bs_validar_cliente.model.Cliente;
import com.validar.cliente.bs_validar_cliente.kafka.ProducerService;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ValidarClienteServiceImp implements ValidarClienteService {


    private ProducerService producerService;

    public ValidarClienteServiceImp(ProducerService producerService){

        this.producerService = producerService;
    }

    @Override
    public String registerCliente(Cliente cliente) {
        return null;
    }

    @Override
    public boolean putClientIntoMessageBus(Cliente cliente) {

        producerService.sendToKafka(cliente.getId().toString(), transformCliente(cliente));

        return false;
    }

    private GenericRecord transformCliente(Cliente cliente) {

        return new GenericRecordBuilder(producerService.getClientSchema())
                .set("name", cliente.getName())
                .set("email", cliente.getEmail())
                .build();
    }


}
