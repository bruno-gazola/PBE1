package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivraria.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findByCpf(String cpf);
	/*Cliente findByRg(String rg);
	Cliente findByEmail(String email);
	Cliente findByTelefone(String telefone);*/
	
}