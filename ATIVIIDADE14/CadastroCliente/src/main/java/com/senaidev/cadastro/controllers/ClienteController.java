package com.senaidev.cadastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastro.entities.Cliente;
import com.senaidev.cadastro.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;

	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.savecliente(cliente);
	}
	
	@PutMapping
	public Cliente editCliente(@RequestBody Cliente cliente) {
		return clienteService.savecliente(cliente);
	}

	@GetMapping
	public List<Cliente> getAllCliente() {
		return clienteService.getAllCliente();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable Long id) {
		Cliente cliente = clienteService.getClienteById(id);
		
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.notFound().build();
		}
		
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteService.deleteCliente(id);
	}

}
