package com.validar.cliente.aledev;

import com.validar.cliente.aledev.service.ValidarClienteService;
import com.validar.cliente.aledev.service.ValidarClienteServiceImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AledevApplication {

	public static void main(String[] args) {
		SpringApplication.run(AledevApplication.class, args);
	}

	@Bean
	public ValidarClienteService validarClienteService(){
		return new ValidarClienteServiceImp();
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}
}
