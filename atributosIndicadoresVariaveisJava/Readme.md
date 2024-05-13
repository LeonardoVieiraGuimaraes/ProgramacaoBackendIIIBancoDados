# Java - Referência Rápida

## Palavras Reservadas

| Palavra Reservada | Descrição |
| --- | --- |
| abstract | Usada para declarar uma classe abstrata ou um método abstrato em uma classe. |
| assert | Usada para fazer uma afirmação que deve ser verdadeira durante a execução. |
| boolean | Usada para declarar uma variável que pode armazenar valores verdadeiros e falsos. |
| break | Usada para sair do bloco de código mais interno. |
| byte | Usada para declarar uma variável que pode armazenar um inteiro de 8 bits. |
| case | Usada em uma instrução switch para marcar um bloco de código. |
| catch | Usada para capturar exceções. |
| char | Usada para declarar uma variável que pode armazenar um caractere Unicode de 16 bits. |
| class | Usada para declarar uma classe. |
| continue | Usada para pular para a próxima iteração de um loop. |
| default | Usada em uma instrução switch para marcar o bloco de código que é executado quando nenhum dos casos é verdadeiro. |
| do | Usada em um loop do-while. |
| double | Usada para declarar uma variável que pode armazenar um número de ponto flutuante de 64 bits. |
| else | Usada para especificar o bloco de código que é executado se a condição if é falsa. |
| enum | Usada para declarar uma enumeração. |
| extends | Usada para indicar que uma classe é uma subclasse de outra classe. |
| final | Usada para indicar que um valor não pode ser alterado. |
| finally | Usada para especificar um bloco de código que é sempre executado quando um bloco try é concluído. |
| float | Usada para declarar uma variável que pode armazenar um número de ponto flutuante de 32 bits. |
| for | Usada para iniciar um loop for. |
| if | Usada para iniciar um bloco de código condicional. |
| implements | Usada para indicar que uma classe implementa uma interface. |
| import | Usada para importar classes, interfaces ou pacotes. |
| instanceof | Usada para verificar se um objeto é de um determinado tipo. |
| int | Usada para declarar uma variável que pode armazenar um inteiro de 32 bits. |
| interface | Usada para declarar uma interface. |
| long | Usada para declarar uma variável que pode armazenar um inteiro de 64 bits. |
| native | Usada para indicar que um método é implementado em código nativo usando JNI (Java Native Interface). |
| new | Usada para criar um novo objeto. |
| package | Usada para declarar um pacote. |
| private | Usada para indicar que um membro só pode ser acessado dentro de sua própria classe. |
| protected | Usada para indicar que um membro só pode ser acessado dentro de sua própria classe, suas subclasses e classes no mesmo pacote. |
| public | Usada para indicar que um membro pode ser acessado de qualquer lugar. |
| return | Usada para terminar a execução de um método e retornar um valor. |
| short | Usada para declarar uma variável que pode armazenar um inteiro de 16 bits. |
| static | Usada para indicar que um membro pertence à classe em vez de a uma instância da classe. |
| super | Usada para se referir a membros da classe pai. |
| switch | Usada para iniciar uma instrução switch. |
| synchronized | Usada para indicar que um método só pode ser acessado por um thread de cada vez. |
| this | Usada para se referir ao objeto atual. |
| throw | Usada para lançar uma exceção. |
| throws | Usada para indicar quais exceções um método pode lançar. |
| transient | Usada para indicar que um membro não deve ser serializado. |
| try | Usada para iniciar um bloco de código que pode lançar uma exceção. |
| void | Usada para indicar que um método não retorna um valor. |
| volatile | Usada para indicar que uma variável pode ser acessada por vários threads e que seu valor pode ser alterado inesperadamente. |
| while | Usada para iniciar um loop while. |

## Modificadores de Acesso

| Modificador | Definição |
| --- | --- |
| public | O membro é acessível de qualquer outra classe. |
| protected | O membro é acessível apenas por classes do mesmo pacote ou por subclasses da classe. |
| nenhum (pacote) | O membro é acessível apenas dentro de seu próprio pacote. |
| private | O membro é acessível apenas de dentro da própria classe. |

## Modificadores de Classe, Método e Variável em Java

| Modificador | Definição |
| --- | --- |
| Abstract | Um método sem definição |
| Extends | Estende uma classe a outra, isto é, indica para uma superclasse que uma subclasse está estendendo, ou seja, tem herança |
| Implements | Indica uma interface que uma classe a implementará |
| Native | Um método foi escrito em uma linguagem que só pode ser utilizada em uma determinada plataforma |
| Static | O método ou a variável pertence à classe e não à instância |
| Final | Indica que uma entidade não possa ser modificada nem derivada posteriormente (não existe herança) |
| Synchronized | O método só pode ser acessado por um thread de cada vez |
| Transient | A variável não é serializada |
| Volatile | O valor da variável pode ser alterado inesperadamente por outras partes do programa |
| Strictfp | Força a precisão dos pontos flutuantes para manter a consistência em todas as plataformas |

## Tipos de Dados Primitivos em Java

| Tipo de Dado | Definição | Exemplo em Java |
| --- | --- | --- |
| Literal | Recebe letras, números e símbolos | char |
| Inteiro | Recebe números inteiros positivos ou negativos | int |
| Real | Recebe números reais, isto é, com casas decimais, positivos ou negativos | float, double |
| Lógico | Recebe verdadeiro (1) ou falso (0) | boolean |
| Byte | Recebe números inteiros de 8 bits, de -128 a 127 | byte |
| Curto | Recebe números inteiros de 16 bits, de -32,768 a 32,767 | short |
| Longo | Recebe números inteiros de 64 bits, de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 | long |