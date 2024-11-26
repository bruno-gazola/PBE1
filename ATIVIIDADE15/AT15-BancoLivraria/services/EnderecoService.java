package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Endereco;
import com.senaidev.bancolivraria.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    // Listar todos os Enderecos
    public List<Endereco> buscarEndereco() {
        return enderecoRepository.findAll();
    }

    // Buscar Endereco por ID
    public Endereco buscarEnderecoPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }
    
    // Salvar Endereco
    public Endereco criarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    // Deletar Endereco
    public void excluirEndereco(Long id) {
        enderecoRepository.deleteById(id);
    }
}