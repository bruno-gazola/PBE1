package com.senaidev.cadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastro.entities.Cliente;
import com.senaidev.cadastro.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente savecliente( Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public Cliente getClienteById (Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

}
