# Spring Boot: Tipos de Parâmetros e Endpoints

No Spring Boot, você pode definir vários tipos de parâmetros para seus endpoints. Aqui estão alguns dos mais comuns:

## Parâmetros de Caminho (@PathVariable)

Os parâmetros de caminho são usados para extrair valores diretamente da URL de um endpoint. Eles são definidos usando a anotação `@PathVariable`.

```java
@GetMapping("/users/{id}")
public User getUser(@PathVariable Long id) {
    // lógica para buscar o usuário pelo id
}

```

## Parâmetros de Consulta (@RequestParam)
Os parâmetros de consulta são usados para passar valores opcionais ou não obrigatórios para um endpoint. Eles são definidos usando a anotação @RequestParam.

```java
@GetMapping("/users")
public List<User> getUsers(@RequestParam(required = false) String name) {
    // lógica para buscar usuários pelo nome, se fornecido
}
```

## Parâmetros de Corpo da Solicitação (@RequestBody)
Os parâmetros de corpo da solicitação são usados para passar objetos complexos para um endpoint. Eles são definidos usando a anotação @RequestBody.

```java
@PostMapping("/users")
public User createUser(@RequestBody User user) {
    // lógica para criar um novo usuário com os detalhes fornecidos
}
```

# Endpoints
Os endpoints são os pontos de entrada para a sua API. No Spring Boot, você define endpoints criando métodos em classes anotadas com @RestController.

Aqui estão alguns exemplos de como definir endpoints:

Endpoint GET: Para buscar recursos.

```java
@GetMapping("/users")
public List<User> getUsers() {
    // lógica para buscar todos os usuários
}
```
Endpoint POST: Para criar novos recursos.

```java
@PostMapping("/users")
public User createUser(@RequestBody User user) {
    // lógica para criar um novo usuário
}
```
Endpoint PUT: Para atualizar recursos existentes.

```java
@PutMapping("/users/{id}")
public User updateUser(@PathVariable Long id, @RequestBody User user) {
    // lógica para atualizar o usuário com o id fornecido
}
```
Endpoint DELETE: Para remover recursos.

```java
@DeleteMapping("/users/{id}")
public void deleteUser(@PathVariable Long id) {
    // lógica para deletar o usuário com o id fornecido
}
```
Esses são os conceitos básicos de como trabalhar com parâmetros e endpoints no Spring Boot.