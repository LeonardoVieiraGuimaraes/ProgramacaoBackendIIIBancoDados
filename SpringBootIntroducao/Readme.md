# Spring Boot

## Introdução

Spring Boot é um projeto da Spring que visa simplificar o processo de configuração e publicação de aplicações Spring. Ele oferece uma maneira "opinionada" de configurar aplicações Spring, o que significa que ele tenta adivinhar o que você quer fazer e pré-configura tudo para você.

## Conceitos Básicos

Aqui estão alguns conceitos básicos do Spring Boot:

- **Autoconfiguração:** Spring Boot possui uma autoconfiguração que tenta automaticamente configurar seu projeto Spring com base nas dependências que você adicionou ao seu `pom.xml` ou `build.gradle`.

- **Starter Dependencies:** São dependências que agrupam outras dependências comuns para simplificar a configuração do projeto.

- **Actuator:** Fornece recursos prontos para produção para monitorar e gerenciar sua aplicação.

- **Spring CLI:** Uma ferramenta de linha de comando que permite executar scripts Groovy e Java com convenções de autoconfiguração do Spring Boot.

## Criação de API

Para criar uma API RESTful com Spring Boot, você precisa seguir alguns passos:

1. **Crie um novo projeto Spring Boot:** Você pode usar [Spring Initializr](https://start.spring.io/) para criar um novo projeto Spring Boot.

2. **Adicione as dependências necessárias:** Para criar uma API RESTful, você precisa da dependência `spring-boot-starter-web`.

3. **Crie uma classe de modelo:** Esta classe representa a entidade que você quer expor através da sua API.

4. **Crie um repositório:** Se você estiver usando JPA, você pode criar uma interface que estende `JpaRepository` para gerenciar as operações de banco de dados.

5. **Crie um controlador:** O controlador é responsável por manipular as solicitações HTTP. Você pode usar anotações como `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`, etc.

6. **Execute a aplicação:** Você pode executar a aplicação usando o comando `mvn spring-boot:run` ou executando a classe principal que contém o método `main` a partir do seu IDE.

Aqui está um exemplo de como criar uma API RESTful simples com Spring Boot:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    @RequestMapping("/api")
    public class ApiController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, Spring Boot!";
        }
    }
}
```
Neste exemplo, criamos uma API que retorna a string "Hello, Spring Boot!" quando você acessa a URL /api/hello.