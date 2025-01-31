# Clientes API

## Descrição
Este é um projeto de API REST para gerenciamento de clientes, desenvolvido em **Java com Spring Boot**. A API permite a criação, consulta, atualização e remoção de clientes, e inclui integração via **Feign Client**.

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA
- Feign Client
- Swagger para documentação
- Maven para gerenciamento de dependências
- Banco de dados relacional (exemplo: PostgreSQL ou MySQL)

## Como Executar
### Requisitos:
- Java 17+
- Maven
- Banco de Dados configurado

### Passos:
1. Clone o repositório:
   ```sh
   git clone <URL_DO_REPOSITORIO>
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd clientes-api
   ```
3. Configure o banco de dados no arquivo `application.properties` ou `application.yml`.
4. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```

## Endpoints Principais
| Método | Endpoint          | Descrição                     |
|---------|------------------|---------------------------------|
| GET     | `/clientes`      | Lista todos os clientes       |
| GET     | `/clientes/{id}` | Obtém um cliente por ID       |
| POST    | `/clientes`      | Adiciona um novo cliente      |
| PUT     | `/clientes/{id}` | Atualiza um cliente existente |
| DELETE  | `/clientes/{id}` | Remove um cliente            |

## Documentação da API
A API conta com documentação interativa via Swagger. Para acessá-la, inicie a aplicação e abra o navegador em:
```
http://localhost:8080/swagger-ui.html
```

## Testes
Para executar os testes unitários e de integração, utilize o comando:
```sh
mvn test
```

## Contribuição
1. Fork este repositório
2. Crie um branch para sua feature (`git checkout -b minha-feature`)
3. Commite suas mudanças (`git commit -m 'Adicionando nova feature'`)
4. Envie seu branch (`git push origin minha-feature`)
5. Abra um Pull Request

## Licença
Este projeto é licenciado sob a MIT License - veja o arquivo `LICENSE` para mais detalhes.
