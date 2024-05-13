# Orientação a Objetos em Java

## Introdução

Este documento fornece uma visão geral da programação orientada a objetos (OOP) com Java. A OOP é um paradigma de programação baseado no conceito de "objetos", que podem conter dados e código: dados na forma de campos (também conhecidos como atributos ou propriedades), e código, na forma de procedimentos (também conhecidos como métodos).

## Conceitos fundamentais

### Classe

Uma classe é um modelo ou um plano a partir do qual os objetos são criados. Portanto, um objeto é uma instância de uma classe.

### Objeto

Um objeto é uma instância de uma classe. Ele tem estado e comportamento. O estado é representado pelos atributos de um objeto e o comportamento é representado pelos métodos de um objeto.

### Herança

Herança é um mecanismo em que um objeto adquire todas as propriedades e comportamentos de um objeto pai. Usado para a reutilização de código.

### Polimorfismo

Polimorfismo permite que uma interface seja usada para representar uma classe geral de ações.

### Encapsulamento

Encapsulamento é um mecanismo que une o código e os dados que ele manipula em uma única unidade.

## Exemplo de código

```java
public class Carro {
    // Atributos
    private String cor;
    private int velocidade;

    // Métodos
    public void acelerar() {
        velocidade++;
    }

    public void frear() {
        if (velocidade > 0) {
            velocidade--;
        }
    }
}