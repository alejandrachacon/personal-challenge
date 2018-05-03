package com.validar.cliente.bs_validar_cliente.model;


import lombok.Data;
import lombok.experimental.Accessors;


@Data
@Accessors(chain= true)
public class Cliente {

    private String name;
    private String email;

}
