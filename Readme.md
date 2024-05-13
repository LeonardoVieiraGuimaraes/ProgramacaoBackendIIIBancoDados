# Programação Backend III com Java e Spring Boot

## Introdução

Este documento fornece uma visão geral da programação backend com Java e Spring Boot. O Spring Boot é um framework que simplifica a configuração e execução de aplicações Java. Ele é amplamente utilizado para desenvolver aplicações web e REST APIs.

## Instalação

1. **Instale o JDK (Java Development Kit):** Você pode baixar a versão mais recente do JDK diretamente do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **Instale o Spring Boot:** O Spring Boot pode ser instalado usando o [Spring Initializr](https://start.spring.io/). Você pode criar um novo projeto Spring Boot selecionando as dependências necessárias para o seu projeto.

3. **Instale o Visual Studio Code:** Se você ainda não tem o VS Code instalado, você pode baixá-lo do [site oficial do VS Code](https://code.visualstudio.com/).

4. **Instale a extensão Spring Boot Tools para VS Code:** Abra o VS Code, clique no ícone de extensões na barra lateral esquerda, procure por "Spring Boot Tools" e clique em "Instalar".

## Criando sua primeira aplicação Spring Boot

1. **Crie um novo projeto Spring Boot:** Use o [Spring Initializr](https://start.spring.io/) para criar um novo projeto. Selecione as dependências necessárias para o seu projeto.

2. **Importe o projeto para o VS Code:** Abra o VS Code e clique em "File" > "Open Folder". Navegue até a pasta do projeto que você criou e clique em "Select Folder".

3. **Escreva o código:** Crie um novo arquivo Java e escreva o seguinte código:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}