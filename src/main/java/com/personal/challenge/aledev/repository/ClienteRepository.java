package com.personal.challenge.aledev.repository;

import com.personal.challenge.aledev.model.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository  extends PagingAndSortingRepository<Cliente, Long> {

    List<Cliente> findAll(Sort sort);
    List<Cliente> findAllByUser(String user);

}
