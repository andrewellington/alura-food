# alura-food

Projetos desenvolvidos durante o curso de Microsserviços na prática: implementando com Java e Spring.

- Criei um microsserviço com Java e Spring, conectando a um banco de dados MariaDB
- Utilizei o Flyway para versionar o banco de dados
- Aprendi a utilizar o Lombok para reduzir a verbosidade do código
- Utilizei o ModelMapper para mapear entidades e DTOs
- Utilizei o Docker e Docker Compose para criar containers para o banco de dados.
- Implementei a técnica de service discovery utilizando o Eureka
- Centralizei requisições adicionando um API Gateway ao projeto
- Fiz a comunicação síncrona entre dois micros serviços com Open Feign
- Entendi os conceitos de circuit breaker e fallback

## Tecnologias utilizadas
Spring Boot, Spring Cloud, Spring Data JPA, Lombok, ModelMapper, Flyway Eureka, Open Feign, MariaDB, Docker, Docker Compose, API Gateway, Circuit Breaker, Fallback.

## Versões
- Java 17.0.11-oraCLE
- Spring Boot 2.6.7
- Spring Cloud 2021.0.2
- Lombok 1.18.24
- ModelMapper 3.1.0
- Flyway 8.0.5
- Eureka 3.1.2
- Open Feign 3.1.2
- MariaDB jdbc 2.7.5
- Docker 26.1.3
- Docker Compose 2.27.0

## Como rodar o projeto
1. Clone o projeto
2. Entrar na pasta docker e executar o comando `docker-compose up -d`
3. Para cada submodulo, entrar na pasta e executar o comando `mvn spring-boot:run`