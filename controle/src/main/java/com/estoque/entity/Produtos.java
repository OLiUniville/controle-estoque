package com.estoque.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name= "produtos")
public class Produtos {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id_produto;
private String codigo_produto;
private String descricao_produto;
@Temporal(TemporalType.TIMESTAMP)
private Date data_criacao_produto;
@Temporal(TemporalType.TIMESTAMP)
private Date data_atualizacao_produto;
private double valor_custo_produto;
private double valor_venda_produto;
@JoinColumn(name="idMarca")
private String marca_produto;

public Produtos() {}


    public Long getIdProduto() {
        return id_produto;
    }

    public void setIdProduto(Long id_produto) {
        this.id_produto = id_produto;
    }

    public String getCodigoProduto() {
        return codigo_produto;
    }

    public void setCodigoProduto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getDescricaoProduto() {
        return descricao_produto;
    }

    public void setDescricaoProduto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public Date getDataCriacaoProduto() {
        return data_criacao_produto;
    }

    public void setDataCriacaoProduto(Date data_criacao_produto) {
        this.data_criacao_produto = data_criacao_produto;
    }

    public Date getDataAtualizacaoProduto() {
        return data_atualizacao_produto;
    }

    public void setDataAtualizacaoProduto(Date data_atualizacao_produto) {
        this.data_atualizacao_produto = data_atualizacao_produto;
    }

    public double getValorCustoProduto() {
        return valor_custo_produto;
    }

    public void setValorCustoProduto(double valor_custo_produto) {
        this.valor_custo_produto = valor_custo_produto;
    }

    public double getValorVendaProduto() {
        return valor_venda_produto;
    }

    public void setValorVendaProduto(double valor_venda_produto) {
        this.valor_venda_produto = valor_venda_produto;
    }

    public String getMarcaProduto() {
        return marca_produto;
    }

    public void setMarcaProduto(String marca_produto) {
        this.marca_produto = marca_produto;
    }


}