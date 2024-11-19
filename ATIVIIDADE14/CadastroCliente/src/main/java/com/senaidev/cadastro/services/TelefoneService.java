package com.senaidev.cadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastro.entities.Telefone;
import com.senaidev.cadastro.repositories.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public Telefone savetelefone( Telefone telefone) {
		return telefoneRepository.save(telefone);
	}
	
	public List<Telefone> getAllTelefone(){
		return telefoneRepository.findAll();
	}
	
	public Telefone getTelefoneById (Long id) {
		return telefoneRepository.findById(id).orElse(null);
	}
	
	public void deleteTelefone(Long id) {
		telefoneRepository.deleteById(id);
	}

}
