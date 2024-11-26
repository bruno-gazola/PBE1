package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivraria.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
	//Autor findById(Long id_autor);
	
}