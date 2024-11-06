package com.estoque.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name = "Pessoa")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pessoa;
    @JoinColumn(name= "Nome")
    private String nome;
    private String cpf;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_criacao_pessoa;
    @Temporal(TemporalType.TIMESTAMP)
    private Date data_atualizacao_pessoa;
    
    Pessoa(){}

        public Long getIdPessoa(){
            return id_pessoa;
        }

        public void setIdPessoa(Long id_pessoa) {
            this.id_pessoa = id_pessoa;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf = cpf;
        }

        public Date getDataCriacaoPessoa(){
            return data_criacao_pessoa;
        }

        public void setDataCriacaoPessoa(Date data_criacao_pessoa){
            this.data_criacao_pessoa = data_criacao_pessoa;
        }

        public Date getDataAtualizacaoPessoa(){
            return data_atualizacao_pessoa;
        }

        public void setDataAtualizacaoPessoa(Date data_atualizacao_pessoa){
            this.data_atualizacao_pessoa = data_atualizacao_pessoa;
        }
    
}

