package SpringBootBeanInjecaoAnotacoes;

import org.springframework.stereotype.Component;
@Component // Esta anotação registra a classe como um bean no Spring Context
public class MeuBean {
// Lógica e propriedades da classe
}


package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = “com.example.beans”) // Especifica o pacote
para varredura de componentes
public class DemoApplication {
public static void main(String[] args) {
SpringApplication.run(DemoApplication.class, args);
}
}


package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MeuServico {
private final MeuBean meuBean;
@Autowired // Injeção de dependência do bean
public MeuServico(MeuBean meuBean) {
this.meuBean = meuBean;
}
// Métodos do serviço que utilizam MeuBean
}

@Component
public class MinhaClasseBean {
// Métodos e propriedades da classe
}

@Autowired
private MinhaClasseBean minhaClasseBean;

<bean id=”minhaClasseBean” class=”com.example.MinhaClasseBean” />

modificadores @interface identificador {
    declarações de elementos
    }

    