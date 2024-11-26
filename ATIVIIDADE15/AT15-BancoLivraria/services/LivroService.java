package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Livro;
import com.senaidev.bancolivraria.repositories.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    // Listar todos os Livros
    public List<Livro> buscarLivro() {
        return livroRepository.findAll();
    }

    // Buscar Livro por ID
    public Livro buscarLivroPorId(Long id) {
        return livroRepository.findById(id).orElse(null);
    }
    
    //Busca Livro por ISBN
    public Livro buscarLivroPorisbn(String isbn) {
    	return livroRepository.findByIsbn(isbn);
    }
    
    // Salvar Livro
    public Livro criarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    // Deletar Livro
    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }
}