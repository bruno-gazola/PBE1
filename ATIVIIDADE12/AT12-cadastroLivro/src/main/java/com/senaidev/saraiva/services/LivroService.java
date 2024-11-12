package com.senaidev.saraiva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.saraiva.entities.Livro;
import com.senaidev.saraiva.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository LivroRepository;
	
	public Livro saveLivro(Livro livro) {
		return LivroRepository.save(livro);
	}
	public List<Livro> getAllLivro(){
		return LivroRepository.findAll();
	}
	public Livro getLivroById(Long id) {
		return LivroRepository.findById(id).orElse(null);
	}
	public void deleteLivro(Long id) {
		LivroRepository.deleteById(id);
	}
}
