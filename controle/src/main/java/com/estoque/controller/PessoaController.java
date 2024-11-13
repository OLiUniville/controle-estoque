package com.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.model.Pessoa;
import com.estoque.model.Enums.TipoPermissao;
import com.estoque.service.PessoaService;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> buscarTodos(@RequestParam("permissao") TipoPermissao permissao) {
        return pessoaService.buscarTodos(permissao);
    }

    @PostMapping("/")
    public Pessoa inserir(@RequestBody Pessoa objeto, @RequestParam("permissao") TipoPermissao permissao) {
        return pessoaService.inserirPessoa(objeto, permissao);
    }

    @PutMapping("/")
    public Pessoa alterar(@RequestBody Pessoa objeto, @RequestParam("permissao") TipoPermissao permissao) {
        return pessoaService.alterarPessoa(objeto, permissao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id, @RequestParam("permissao") TipoPermissao permissao) {
        pessoaService.excluir(id, permissao);
        return ResponseEntity.ok().build();
    }
}

