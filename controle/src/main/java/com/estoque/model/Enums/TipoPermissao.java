package com.estoque.model.Enums;

public enum TipoPermissao {
    
    ADM,
    FUNCIONARIO,
    VENDEDOR;

    public boolean inserir() {
        return this == ADM;
    }

    public boolean alterar() {
        return this == ADM || this == FUNCIONARIO;
    }

    public boolean buscarTodos() {
        return true;  
    }

    public boolean excluir() {
        return this == ADM;
    }
}
