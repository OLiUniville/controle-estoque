package com.estoque.model.Enums;

public enum TipoPermissao {
    
    ADM,
    FUNCIONARIO,
    VENDEDOR;

    public boolean podeCriar() {
        return this == ADM;
    }

    public boolean podeAtualizar() {
        return this == ADM || this == FUNCIONARIO;
    }

    public boolean podeVisualizar() {
        return true;  
    }

    public boolean podeDeletar() {
        return this == ADM;
    }
}
