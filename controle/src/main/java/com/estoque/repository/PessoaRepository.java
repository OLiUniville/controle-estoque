package com.estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estoque.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
