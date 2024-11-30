package com.estoque.model;

import java.util.Date;

import com.estoque.model.Enums.TipoPermissao;

import jakarta.persistence.*;

/*Esta é uma classe responsavel pela entidade pessoa, onde contem os atributos e metodos. */

@Entity
@Table(name = "Pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pessoa;
    private String nome;
    private String cpf;
    @Enumerated(EnumType.STRING)
    private TipoPermissao tipoPermissao;  
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_criacao_pessoa;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_atualizacao_pessoa;

    public Long getIdPessoa() {
        return id_pessoa;
    }

    public void setIdPessoa(Long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoPermissao getTipoPermissao() {
        return tipoPermissao;
    }

    public void setTipoPermissao(TipoPermissao tipoPermissao) {
        this.tipoPermissao = tipoPermissao;
    }

    public Date getDataCriacaoPessoa() {
        return data_criacao_pessoa;
    }

    public void setDataCriacaoPessoa(Date data_criacao_pessoa) {
        this.data_criacao_pessoa = data_criacao_pessoa;
    }

    public Date getDataAtualizacaoPessoa() {
        return data_atualizacao_pessoa;
    }

    public void setDataAtualizacaoPessoa(Date data_atualizacao_pessoa) {
        this.data_atualizacao_pessoa = data_atualizacao_pessoa;
    }
}
