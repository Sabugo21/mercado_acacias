package com.controller;

import com.dao.produtoDAO;
import com.model.produto;
import java.util.List;

public class produtoController {

    private produtoDAO produtoDAO;

    public produtoController() {
        this.produtoDAO = new produtoDAO();
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O nome do produto não pode estar vazio.");
            return;
        }
        if (preco <= 0) {
            System.out.println("O preço deve ser maior que zero.");
            return;
        }

        produto produto = new produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        produtoDAO.inserir(produto);
    }

    public List<produto> listarProdutos() {
        return produtoDAO.listar();
    }
}