package com.sql;

public interface BancoDados extends SqlDCL,SqlDDL,SqlDML{
    void abrirConexao();
    void fecharConexao();
}
