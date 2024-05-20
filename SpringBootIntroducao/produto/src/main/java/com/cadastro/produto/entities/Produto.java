// Define o pacote no qual a classe Produto está localizada
package com.cadastro.produto.entities;

// Importa a anotação Entity do pacote jakarta.persistence. 
// A anotação Entity é usada para indicar que a classe é uma entidade, ou seja, uma tabela no banco de dados.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// A anotação Entity indica que esta classe é mapeada para uma tabela no banco de dados.
@Entity
public class Produto {
    // A anotação Id indica que este campo é a chave primária da tabela.
    // A anotação GeneratedValue com a estratégia GenerationType.IDENTITY indica que o valor deste campo deve ser gerado automaticamente pelo banco de dados.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo; // Este campo armazena o código do produto.

    // Os demais campos armazenam informações sobre o produto: nome, descrição, preço e quantidade.
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidade;

    // Os métodos getCodigo, getNome, getDescricao, getPreco e getQuantidade são getters que retornam o valor dos respectivos campos.
    // Os métodos setCodigo, setNome, setDescricao, setPreco e setQuantidade são setters que definem o valor dos respectivos campos.

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