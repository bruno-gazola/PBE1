package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Autor;
import com.senaidev.bancolivraria.repositories.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    //Buscar autor
    public List<Autor> buscarAutor() {
        return autorRepository.findAll();
    }

    // Buscar autor por ID
    public Autor buscarAutorPorId(Long id) {
        return autorRepository.findById(id).orElse(null);
    }
    
    // Salvar autor
    public Autor criarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    // Deletar autor
    public void excluirAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
