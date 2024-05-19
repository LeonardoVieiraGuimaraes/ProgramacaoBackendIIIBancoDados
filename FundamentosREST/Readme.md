# Fundamentos de REST

## Introdução

REST (Representational State Transfer) é um estilo arquitetural para a construção de serviços web. Ele é amplamente utilizado para a criação de APIs devido à sua simplicidade e eficiência.

## Conceitos

Existem alguns conceitos fundamentais que são essenciais para entender o REST:

- **Recursos:** No REST, tudo é considerado um recurso. Um recurso é uma entidade ou objeto de dados identificado por um URL.

- **Métodos HTTP:** O REST utiliza os métodos HTTP para realizar operações nos recursos. Os métodos mais comuns são GET (recuperar um recurso), POST (criar um novo recurso), PUT (atualizar um recurso existente) e DELETE (remover um recurso).

- **Representações:** Quando um cliente faz uma solicitação para um recurso, o servidor responde com uma representação desse recurso. Essa representação pode estar em vários formatos, como JSON ou XML.

## Códigos de Status HTTP

Os códigos de status HTTP são uma parte importante do REST. Eles informam ao cliente o resultado de sua solicitação. Aqui estão alguns dos códigos de status HTTP mais comuns usados em APIs REST:

- **200 OK:** A solicitação foi bem-sucedida.
- **201 Created:** Um novo recurso foi criado com sucesso.
- **400 Bad Request:** A solicitação não pôde ser entendida ou estava com formato errado.
- **401 Unauthorized:** A solicitação requer autenticação. O cliente deve se autenticar para obter a resposta desejada.
- **403 Forbidden:** O cliente está autenticado, mas não tem permissão para acessar o recurso.
- **404 Not Found:** O recurso solicitado não pôde ser encontrado.
- **500 Internal Server Error:** Ocorreu um erro no servidor ao processar a solicitação.

Para uma lista completa de códigos de status HTTP, você pode consultar a [documentação oficial](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status).