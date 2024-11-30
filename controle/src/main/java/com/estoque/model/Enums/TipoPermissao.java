package com.estoque.model.Enums;

/*Esta entidade é responsável por configurar a lógica do enum, que, por sua vez, define um objeto com o seu valor constante.*/

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
