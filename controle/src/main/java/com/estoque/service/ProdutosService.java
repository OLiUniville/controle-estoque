package com.estoque.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.model.Produtos;
import com.estoque.repository.ProdutoRepository;

@Service
public class ProdutosService {

    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para buscar todos os produtos
    public List<Produtos> buscarTodos() {
        return produtoRepository.findAll();
    }

    // Método para inserir um novo produto
    public Produtos inserir(Produtos objeto) {
        objeto.setDataCriacaoProduto(new Date()); // Defina a data de criação
        return produtoRepository.saveAndFlush(objeto); // Corrigido: saveAndFlush
    }

    // Método para alterar um produto
    public Produtos alterar(Produtos objeto) {
        objeto.setDataAtualizacaoProduto(new Date()); // Defina uma data de atualização
        return produtoRepository.saveAndFlush(objeto);
    }

    // Método para excluir um produto pelo ID
    public void excluir(Long id) {
        Produtos objeto = produtoRepository.findById(id).orElse(null);
        if (objeto != null) {
            produtoRepository.delete(objeto);
        }
    }
}
