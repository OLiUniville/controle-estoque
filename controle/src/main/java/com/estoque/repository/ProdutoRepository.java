package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estoque.model.Produtos;

/*Esta interface serve como repositório para a entidade Produtos, implementando o JpaRepository, que é responsável por gerenciar as operações de CRUD no banco de dados. */

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {
    
}