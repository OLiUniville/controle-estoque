package com.estoque.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.exception.UnauthorizedException;
import com.estoque.model.Pessoa;
import com.estoque.model.Enums.TipoPermissao;
import com.estoque.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos(TipoPermissao permissao) {
        if (!permissao.buscarTodos()) {
            throw new UnauthorizedException("Permissão negada para buscar registros.");
        }
        return pessoaRepository.findAll();
    }

    public Pessoa inserirPessoa(Pessoa objeto, TipoPermissao permissao) {
        if (!permissao.inserir()) {
            throw new UnauthorizedException("Permissão negada para inserir registros.");
        }
        return pessoaRepository.saveAndFlush(objeto);
    }

    public Pessoa alterarPessoa(Pessoa objeto, TipoPermissao permissao) {
        if (!permissao.alterar()) {
            throw new UnauthorizedException("Permissão negada para alterar registros.");
        }
        return pessoaRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id, TipoPermissao permissao) {
        if (!permissao.excluir()) {
            throw new UnauthorizedException("Permissão negada para excluir registros.");
        }
        Pessoa objeto = pessoaRepository.findById(id).orElse(null);
        if (objeto != null) {
            pessoaRepository.delete(objeto);
        }
    }
}
