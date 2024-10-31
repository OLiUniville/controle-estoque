package com.estoque.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.estoque.model.Produtos;
import com.estoque.service.ProdutosService;

@Controller
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutosService produtoService;

    @GetMapping("/")
    public List<Produtos> buscarTodos(){
        return produtoService.buscarTodos();
    }

    @PostMapping("/")
    public Produtos inserir(@RequestBody Produtos objeto){
        return produtoService.inserir(objeto);
    }

    @PutMapping("/")
    public Produtos alterar(@RequestBody Produtos objeto){
        return produtoService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }
    


}