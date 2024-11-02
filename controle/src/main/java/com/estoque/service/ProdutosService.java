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

   
    public List<Produtos> buscarTodos() {
        return produtoRepository.findAll();
    }

 
    public Produtos inserir(Produtos objeto) {
        objeto.setDataCriacaoProduto(new Date()); 
        return produtoRepository.saveAndFlush(objeto); 
    }

    
    public Produtos alterar(Produtos objeto) {
        objeto.setDataAtualizacaoProduto(new Date());
        return produtoRepository.saveAndFlush(objeto);
    }

   
    public void excluir(Long id) {
        Produtos objeto = produtoRepository.findById(id).orElse(null);
        if (objeto != null) {
            produtoRepository.delete(objeto);
        }
    }
}
