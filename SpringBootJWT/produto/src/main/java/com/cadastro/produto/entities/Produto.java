// Define o pacote no qual a classe Produto está localizada
package com.cadastro.produto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// A anotação Entity indica que esta classe é mapeada para uma tabela no banco de dados.

/**
 *
 * @author leona
 */
@Entity
public class Produto {
    // A anotação Id indica que este campo é a chave primária da tabela.
    // A anotação GeneratedValue com a estratégia GenerationType.IDENTITY indica que
    // o valor deste campo deve ser gerado automaticamente pelo banco de dados.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo; // Este campo armazena o código do produto.

    // Os demais campos armazenam informações sobre o produto: nome, descrição,
    // preço e quantidade.
    
    @NotBlank(message = "O nome do produto não pode estar vazio.")
    private String nome;

    @NotBlank(message = "A descrição do produto não pode estar vazia.")
    private String descricao;

    @NotNull(message = "O preço do produto não pode ser nulo.")
    @Min(value = 0, message = "O preço do produto não pode ser negativo.")
    private Double preco;

    @NotNull(message = "A quantidade do produto não pode ser nula.")
    @Min(value = 0, message = "A quantidade do produto não pode ser negativa.")
    private Integer quantidade;

    // Os métodos getCodigo, getNome, getDescricao, getPreco e getQuantidade são
    // getters que retornam o valor dos respectivos campos.
    // Os métodos setCodigo, setNome, setDescricao, setPreco e setQuantidade são
    // setters que definem o valor dos respectivos campos.

    // Getter para o código do produto
    public Integer getCodigo() {
        return codigo;
    }

    // Setter para o código do produto
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    // Getter para o nome do produto
    public String getNome() {
        return nome;
    }

    // Setter para o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a descrição do produto
    public String getDescricao() {
        return descricao;
    }

    // Setter para a descrição do produto
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para o preço do produto
    public Double getPreco() {
        return preco;
    }

    // Setter para o preço do produto
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Getter para a quantidade do produto em estoque
    public Integer getQuantidade() {
        return quantidade;
    }

    // Setter para a quantidade do produto em estoque
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}