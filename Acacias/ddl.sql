-- Criação e seleção da base de dados
CREATE DATABASE IF NOT EXISTS mercado_acacias;
USE mercado_acacias;

-- Tabela de Produtos
CREATE TABLE IF NOT EXISTS produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INT NOT NULL
);

-- Tabela de Funcionários
CREATE TABLE IF NOT EXISTS funcionario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(100) NOT NULL,
    cargo VARCHAR(50) NOT NULL
);