# SalesHub Java

API REST de vendas em Java 21 e Spring Boot 3. O projeto demonstra produtos, clientes, usuários, carrinho, descontos, estoque transacional, cancelamento, validação, tratamento de exceções e testes.

## Executar no IntelliJ
1. Abra a pasta no IntelliJ IDEA.
2. Configure o JDK 21.
3. Execute `SalesHubApplication`.
4. Acesse `http://localhost:8080/swagger-ui.html`.

## Testes

```bash
mvn test
```

## Exemplo de venda

```json
{"sellerId":1,"customerId":1,"paymentMethod":"PIX","coupon":"BEMVINDO10","items":[{"productId":1,"quantity":2}]}
```

Para produção, habilite JWT, use PostgreSQL, Flyway e controle de concorrência com `@Version` ou atualização condicional de estoque.
