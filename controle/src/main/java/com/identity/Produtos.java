package com.identity;

import java.time.LocalDateTime;

@Entity

public class Produtos {
    
private Long id_produto;
private String codigo_produto;
private String descricao_produto;
private LocalDateTime data_criacao_produto;
private LocalDateTime data_atualizacao_produto;
private double valor_custo_produto;
private double valor_venda_produto;
private String marca_produto;

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

    public LocalDateTime getDataCriacaoProduto() {
        return data_criacao_produto;
    }

    public void setDataCriacaoProduto(LocalDateTime data_criacao_produto) {
        this.data_criacao_produto = data_criacao_produto;
    }

    public LocalDateTime getDataAtualizacaoProduto() {
        return data_atualizacao_produto;
    }

    public void setDataAtualizacaoProduto(LocalDateTime data_atualizacao_produto) {
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