package com.cadastro.produtos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cadastro.produtos.entities.Produto;

@Service
public class ProdutoService {

    // Método para listar todos os produtos
    public List<Produto> listarProdutos() {
        // Implementação para buscar produtos no banco de dados ou outro sistema de armazenamento
        return null;
    }

    // Método para buscar um produto por ID
    public Produto buscarProdutoPorId(Integer id) {
        // Implementação para buscar um produto por ID no banco de dados ou outro sistema de armazenamento
        return null;
    }

    // Método para adicionar um novo produto
    public Produto adicionarProduto(Produto produto) {
        // Implementação para adicionar um novo produto no banco de dados ou outro sistema de armazenamento
        return null;
    }

    // Método para atualizar um produto existente
    public Produto atualizarProduto(Integer id, Produto produto) {
        // Implementação para atualizar um produto existente no banco de dados ou outro sistema de armazenamento
        return null;
    }

    // Método para excluir um produto
    public void excluirProduto(Integer id) {
        // Implementação para excluir um produto do banco de dados ou outro sistema de armazenamento
    }
}
