package com.senaidev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.loja.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
