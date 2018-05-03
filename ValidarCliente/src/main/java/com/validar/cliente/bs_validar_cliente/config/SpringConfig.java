package com.validar.cliente.bs_validar_cliente.config;


import com.validar.cliente.bs_validar_cliente.kafka.ProducerService;
import com.validar.cliente.bs_validar_cliente.service.ValidarClienteServiceImp;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class SpringConfig {

    public static final String BOOTSTRAP_SERVERS = "localhost:9092";
    public static final String SCHEMA_REGISTRY = "http://localhost:8081";

    @Bean
    public KafkaProducer producer(){
        final Properties producerConfig = new Properties();
        producerConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, io.confluent.kafka.serializers.KafkaAvroSerializer.class);
        producerConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,io.confluent.kafka.serializers.KafkaAvroSerializer.class );
        producerConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        producerConfig.put("acks", "all");
        producerConfig.put("retries", 0);
        producerConfig.put("schema.registry.url", SCHEMA_REGISTRY);
        System.out.println("Creating KafkaProducer...");
        return new KafkaProducer(producerConfig);
    }

    @Bean
    public ProducerService producerService(final KafkaProducer newProducer){
        System.out.println("Creating Producer Service....");
        return new ProducerService(newProducer);
    }

    @Bean
    public ValidarClienteServiceImp validarClienteServiceImp(final ProducerService producerService){
        System.out.println("Creando Service Bean Validar Cliente");
        return new ValidarClienteServiceImp(producerService);
    }



}
