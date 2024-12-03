package com.senaidev.loja.controllers;

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

import com.senaidev.loja.entities.Funcionario;
import com.senaidev.loja.services.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioService funcionarioService;

	@PostMapping
	public Funcionario createFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.savefuncionario(funcionario);
	}
	
	@PutMapping
	public Funcionario editFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioService.savefuncionario(funcionario);
	}

	@GetMapping
	public List<Funcionario> getAllFuncionario() {
		return funcionarioService.getAllFuncionario();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Funcionario> getFuncionario(@PathVariable Long id) {
		Funcionario funcionario = funcionarioService.getFuncionarioById(id);
		
		if (funcionario != null) {
			return ResponseEntity.ok(funcionario);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable Long id) {
		funcionarioService.deleteFuncionario(id);
	}

}