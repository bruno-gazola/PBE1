package com.senaidev.bancolivraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.bancolivraria.entities.Pedido;
import com.senaidev.bancolivraria.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Listar todos os Pedidos
    public List<Pedido> buscarPedido() {
        return pedidoRepository.findAll();
    }

    // Buscar Pedido por ID
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    
    // Salvar Pedido
    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Deletar Pedido
    public void excluirPedido(Long id) {
        pedidoRepository.deleteById(id);
    }
}