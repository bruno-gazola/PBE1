package com.senaidev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.loja.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
