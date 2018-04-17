package com.propuesta.cliente.bs_propuesta_cliente;

import com.propuesta.cliente.bs_propuesta_cliente.service.PropuestaClienteService;
import com.propuesta.cliente.bs_propuesta_cliente.service.PropuestaClienteServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BsPropuestaClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BsPropuestaClienteApplication.class, args);
	}


	@Bean
	public PropuestaClienteService propuestaClienteService() {
		return new PropuestaClienteServiceImpl();
	}

	@Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
	    return builder.build();
    }


}
