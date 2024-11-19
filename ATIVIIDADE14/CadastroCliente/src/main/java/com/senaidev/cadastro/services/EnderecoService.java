package com.senaidev.cadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastro.entities.Endereco;
import com.senaidev.cadastro.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco saveendereco( Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> getAllEndereco(){
		return enderecoRepository.findAll();
	}
	
	public Endereco getEnderecoById (Long id) {
		return enderecoRepository.findById(id).orElse(null);
	}
	
	public void deleteEndereco(Long id) {
		enderecoRepository.deleteById(id);
	}

}
