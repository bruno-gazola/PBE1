package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivraria.entities.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{
	Editora findByCnpj(String cnpj);
	
}