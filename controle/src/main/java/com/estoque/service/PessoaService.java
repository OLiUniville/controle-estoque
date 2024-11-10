package com.estoque.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estoque.model.Pessoa;
import com.estoque.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }

    public Pessoa inserirPessoa(Pessoa objeto) {
        objeto.setDataCriacaoPessoa(new Date());
        return pessoaRepository.saveAndFlush(objeto);
    }

    public Pessoa alterarPessoa(Pessoa objeto) {
        objeto.setDataAtualizacaoPessoa(new Date());
        return pessoaRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Pessoa objeto = pessoaRepository.findById(id).orElse(null);
        if (objeto != null) {
            pessoaRepository.delete(objeto);
        }
    }
}
