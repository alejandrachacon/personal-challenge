package com.propuesta.cliente.bs_propuesta_cliente.DTO;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class PropuestaClienteDTO {
    String title;
    long id;
    long idClient;

}

