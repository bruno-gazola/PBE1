package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Cliente;
import com.senaidev.bancolivraria.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos os clientes
    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    // Buscar cliente por ID
    public Cliente buscarClientesPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    //Busca cliente por CPF
    public Cliente buscarClientePorCpf(String cpf) {
    	return clienteRepository.findByCpf(cpf);
    }
    
    /*Busca cliente por RG
    public Cliente buscarClientePorRg(String rg) {
    	return clienteRepository.findByRg(rg);
    }
    
    //Busca cliente por e-mail
    public Cliente buscarClientePorEmail(String email) {
    	return clienteRepository.findByEmail(email);
    }
    
    //Busca cliente por telefone
    public Cliente buscarClientePorTelefone(String telefone) {
    	return clienteRepository.findByTelefone(telefone);
    }*/
    
    
    // Salvar cliente
    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Deletar cliente
    public void excluirCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}