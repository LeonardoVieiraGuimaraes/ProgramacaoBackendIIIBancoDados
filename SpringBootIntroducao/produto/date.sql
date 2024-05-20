CREATE DATABASE empresa;

USE empresa;

CREATE TABLE produto (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    descricao TEXT,
    preco DECIMAL(10, 2),
    quantidade INT
);

show tables;


SELECT * FROM produto;

{
    "codigo": 1,
    "nome": "sapato",
    "descricao": "Todos Tamanhos",
    "preco": 95.49,
    "quantidade": 10
}