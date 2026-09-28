package com.dao;

import com.conexao.conexao;
import com.model.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class produtoDAO {

    // Método para inserir um produto
    public void inserir(produto produto) {
        String sql = "INSERT INTO produto (nome, preco, quantidade) VALUES (?, ?, ?)";

        try (Connection conn = conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQuantidade());

            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }

    // Método para listar todos os produtos
    public List<produto> listar() {
        String sql = "SELECT * FROM produto";
        List<produto> produtos = new ArrayList<>();

        try (Connection conn = conexao.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                produto p = new produto();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getDouble("preco"));
                p.setQuantidade(rs.getInt("quantidade"));
                produtos.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }

        return produtos;
    }
}