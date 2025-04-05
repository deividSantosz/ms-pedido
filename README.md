# 🧾 Microserviço de Pedidos (Producer)

Este projeto é um microserviço responsável por **receber e processar pedidos**, salvá-los no banco de dados e enviar a **descrição do pedido** para uma fila RabbitMQ para processamento assíncrono.

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- RabbitMQ (mensageria)
- Banco de Dados: PostgreSQL

---

## 📦 Funcionalidades

- Criar um pedido com múltiplos itens via API REST
- Persistir os dados no banco de dados relacional
- Publicar mensagens na fila RabbitMQ com a descrição do pedido

---

## 📫 Endpoints

### `POST /pedidos`
Cria um novo pedido.

#### Exemplo de corpo da requisição:

```json
{
  "descricao": "Pedido de livros",
  "itens": [
    { "nome": "Livro Java", "quantidade": 2 },
    { "nome": "Livro Spring", "quantidade": 1 }
  ]
}
```

🔗 Serviço Producer (Envio de Mensagens)
Este serviço depende do microserviço pedido que consome as mensagens da fila do RabbitMQ.

📤 Acesse o repositório do Consumer:
👉 https://github.com/deividSantosz/ms-processamento
