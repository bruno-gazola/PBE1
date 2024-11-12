package com.senaidev.saraiva.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.saraiva.entities.Livro;
import com.senaidev.saraiva.services.LivroService;



@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService LivroService;

	@PostMapping
	public Livro createAluno(Livro livro) {
		return LivroService.saveLivro(livro);
	}

	@GetMapping
	public List<Livro> getAllLivro() {
		return LivroService.getAllLivro();
	}

	@GetMapping("/{Id}")
	public Livro getLivro(@PathVariable Long id) {
		return LivroService.getLivroById(id);
	}
	@DeleteMapping("/{Id}")
	public void deleteLivro(@PathVariable Long id) {
		LivroService.deleteLivro(id);
	}
}
