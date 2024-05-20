// Define o pacote no qual a classe ProdutoController está localizada
package com.cadastro.produto.controllers;

// Importa as classes e anotações necessárias do Spring Framework
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.produto.entities.Produto;
import com.cadastro.produto.repositories.ProdutoRepository;

import jakarta.validation.Valid;
// Anotação para indicar que esta classe é um controlador REST
@RestController
// Anotação para mapear as requisições para este controlador para o caminho /api/produtos
@RequestMapping("/api/produtos")
public class ProdutoController {
    // Anotação para injetar automaticamente o ProdutoRepository
    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para listar todos os produtos
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    // Método para criar um novo produto
    @PostMapping
    public Produto criarProduto(@Valid @RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }


    // Método para buscar um produto pelo ID
    @GetMapping("/{id}")
    public Produto buscarProduto(@PathVariable Integer id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
    }

// Método para atualizar um produto existente
@PutMapping("/{id}")
public Produto atualizarProduto(@PathVariable Integer id, @Valid @RequestBody Produto produtoAtualizado) {
    return produtoRepository.findById(id)
            .map(produto -> {
                produto.setNome(produtoAtualizado.getNome());
                produto.setDescricao(produtoAtualizado.getDescricao());
                produto.setPreco(produtoAtualizado.getPreco());
                produto.setQuantidade(produtoAtualizado.getQuantidade());
                return produtoRepository.save(produto);
            })
            .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
}

    // Método para deletar um produto pelo ID
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
    }
}