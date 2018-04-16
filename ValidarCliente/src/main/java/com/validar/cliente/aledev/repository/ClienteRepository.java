package com.validar.cliente.aledev.repository;

import com.validar.cliente.aledev.model.Cliente;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ClienteRepository  extends PagingAndSortingRepository<Cliente, Long> {

    List<Cliente> findAll(Sort sort);

}
