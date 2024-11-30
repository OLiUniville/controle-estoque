package com.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.estoque.model.Pessoa;
import com.estoque.model.Enums.TipoPermissao;
import com.estoque.service.PessoaService;

/*PessoaContoller, Esta classe é responsavel por gerenciar as operações de CRUD da entidade Pesssoa*/

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

