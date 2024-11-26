package com.senaidev.bancolivraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.bancolivraria.entities.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	//Pedido findByCpf(String cpf);
	
}