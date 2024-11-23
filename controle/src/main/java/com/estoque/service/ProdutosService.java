package com.estoque.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estoque.exception.UnauthorizedException;
import com.estoque.model.Pessoa;
import com.estoque.model.Produtos;
import com.estoque.model.Enums.TipoPermissao;
import com.estoque.repository.PessoaRepository;
import com.estoque.repository.ProdutoRepository;

@Service
public class ProdutosService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Produtos> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Produtos inserir(Produtos produto, Long idUsuario) {
        Pessoa usuario = getIdPessoa(idUsuario);

        if (!usuario.getTipoPermissao().inserir()) {
            throw new UnauthorizedException("Permissão negada para inserir produtos.");
        }

        produto.setDataCriacaoProduto(new Date());
        return produtoRepository.saveAndFlush(produto);
    }

    public Produtos alterar(Produtos objeto, TipoPermissao permissao) {
        if (!permissao.alterar()) {
            throw new UnauthorizedException("Permissão negada para alterar registros.");
        }
        return produtoRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id) {
        Produtos objeto = produtoRepository.findById(id).orElseThrow(() -> 
            new UnauthorizedException("Produto não encontrado.")
        );
        produtoRepository.delete(objeto);
    }

   
    public Pessoa getIdPessoa(Long idPessoa) {
        return pessoaRepository.findById(idPessoa)
                .orElseThrow(() -> new UnauthorizedException("Usuário não encontrado com o ID: " + idPessoa));
    }
}
