package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivraria.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findByIsbn(String isbn);
	
}