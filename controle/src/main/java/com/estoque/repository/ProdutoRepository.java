package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estoque.model.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
    
}