# SalesHub Java

O SalesHub Java é uma API de vendas desenvolvida com Java 21 e Spring Boot. O projeto representa o backend de uma aplicação comercial, com foco em organização de código, regras de negócio, persistência de dados e segurança de operações.

A aplicação permite trabalhar com produtos, clientes, usuários, vendas e itens de venda. O processo de venda aceita vários produtos no mesmo pedido, verifica a disponibilidade do estoque, calcula o subtotal e aplica regras de desconto baseadas na quantidade de itens, em cupons promocionais e na fidelidade do cliente.

Um dos principais pontos técnicos do projeto é o controle transacional da venda. A gravação da venda e a baixa do estoque são tratadas como uma única operação. Dessa forma, caso ocorra algum problema durante o processamento, o sistema evita manter uma venda registrada sem a atualização correspondente do estoque.

O projeto também contempla o cancelamento de vendas com reposição dos produtos ao estoque. Foram incluídas validações para carrinho vazio, produto inexistente, quantidade inválida e estoque insuficiente. Os erros de negócio são tratados de maneira padronizada para facilitar o entendimento das respostas da API.

A estrutura utiliza uma separação entre entidades de domínio, serviços, repositórios e camada web. Essa organização facilita a manutenção do sistema, permite a evolução das regras comerciais e torna o código mais adequado para testes automatizados.

O armazenamento foi preparado para execução local com banco H2 e possui configuração compatível com PostgreSQL. A API pode ser explorada por meio da documentação interativa disponibilizada pelo OpenAPI e pelo Swagger.

Os valores financeiros são representados com precisão utilizando BigDecimal, evitando problemas comuns de arredondamento em operações monetárias. O projeto também contém testes automatizados para verificar o cálculo de descontos e os limites das regras comerciais.

Entre as tecnologias utilizadas estão Java 21, Spring Boot, Spring Data JPA, Hibernate, Spring Security, Jakarta Validation, H2, PostgreSQL, Maven, OpenAPI e JUnit 5.

O SalesHub Java foi criado como projeto de estudo e portfólio para demonstrar conhecimentos em desenvolvimento backend, APIs REST, orientação a objetos, persistência relacional, transações, validação, tratamento de erros e testes em aplicações Java.

Como evolução futura, o projeto pode receber autenticação JWT completa, permissões específicas para administradores e vendedores, relatórios financeiros, paginação, migrações versionadas, controle avançado de concorrência no estoque, integração com serviços de pagamento e pipeline de integração contínua.

