package com.estoque.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.estoque.model.Pessoa;
import com.estoque.model.Produtos;
import com.estoque.service.ProdutosService;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutosService produtoService;

    @GetMapping("/")
    public List<Produtos> buscarTodos(@RequestParam("id_usuario") Long idUsuario) {
        return produtoService.buscarTodos();
    }

    @PostMapping("/")
    public Produtos inserir(@RequestBody Produtos objeto, @RequestParam("id_usuario") Long idUsuario) {
        return produtoService.inserir(objeto, idUsuario);
    }

    @PutMapping("/")
    public Produtos alterar(@RequestBody Produtos objeto, @RequestParam("id_usuario") Long idUsuario) {
        Pessoa usuario = produtoService.getIdPessoa(idUsuario);
        return produtoService.alterar(objeto, usuario.getTipoPermissao());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id, @RequestParam("id_usuario") Long idUsuario) {
        Pessoa usuario = produtoService.getIdPessoa(idUsuario);
        if (!usuario.getTipoPermissao().excluir()) {
            return ResponseEntity.status(403).build();
        }
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
