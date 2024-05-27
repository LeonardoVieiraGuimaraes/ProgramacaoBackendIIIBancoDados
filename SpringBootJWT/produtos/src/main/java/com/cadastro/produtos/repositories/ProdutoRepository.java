// Define o pacote no qual a interface ProdutoRepository está localizada
package com.cadastro.produtos.repositories;

// Importa a interface JpaRepository do Spring Data JPA. 
// JpaRepository é uma interface do Spring Data JPA que contém métodos para operações de CRUD (criação, leitura, atualização e exclusão) e outras operações comuns de banco de dados.

import org.springframework.stereotype.Repository;
import com.cadastro.produtos.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;



// A anotação Repository indica que esta interface é um repositório Spring.
@Repository
// A interface ProdutoRepository estende JpaRepository, o que significa que ela herda todos os métodos de JpaRepository.
// Os dois parâmetros de JpaRepository são a classe de entidade e o tipo da chave primária da entidade.
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}