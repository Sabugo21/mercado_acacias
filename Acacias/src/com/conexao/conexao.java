package com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/mercado_acacias?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234"; // Deixe vazio se não tiver password no seu MySQL

    public static Connection conectar() {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão efetuada com sucesso!");
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return null;
    }

    // Método principal para testar a conexão diretamente
    public static void main(String[] args) {
        conectar();
    }
}