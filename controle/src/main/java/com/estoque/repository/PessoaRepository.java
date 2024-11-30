package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estoque.model.Pessoa;

/*Esta interface serve como repositório para a entidade Pessoa, implementando o JpaRepository, que é responsável por gerenciar as operações de CRUD no banco de dados.*/

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    
}
