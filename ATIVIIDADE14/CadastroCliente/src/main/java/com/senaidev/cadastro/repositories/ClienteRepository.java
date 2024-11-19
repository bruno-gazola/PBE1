package com.senaidev.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastro.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
