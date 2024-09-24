# Sistema de Envio de E-mails e Gerenciamento de Clientes

## Descrição

Este projeto é um sistema desenvolvido em **Spring Boot** que permite gerenciar clientes e realizar o envio de e-mails. O sistema inclui funcionalidades de criação, validação e listagem de clientes, além de operações de envio de e-mails associados a cada cliente. 

O sistema foi projetado com base em uma arquitetura de **serviços** e **repositórios**, com classes que tratam das operações relacionadas a clientes e e-mails.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Lombok**
- **PostgreSQL**
- **Maven**
- **Jakarta Servlet API**

## Funcionalidades

- **Gerenciamento de Clientes**: permite a criação e validação de clientes com base em um CPF válido.
- **Envio de E-mails**: realiza o envio de e-mails associados a cada cliente.
- **Validação de CPF**: utiliza a biblioteca `Stella` para validação de CPF, garantindo que apenas CPFs válidos sejam aceitos.

## Estrutura do Projeto

### Entidades

- **Cliente**: representa um cliente com atributos como nome, e-mail, CPF e outros dados necessários.
- **Email**: representa o e-mail que será enviado ao cliente.
- **Produto**: contém informações sobre produtos.
- **Pedido e ItemPedido**: para gerenciar as compras e itens do cliente.

### Serviços

- **ClienteService**: realiza a validação e a criação de clientes no sistema.
- **EmailService**: cuida das operações de envio e listagem de e-mails.
- **ProdutoService**: métodos para busca e manipulação de produtos.
- **PedidoService**: trata das operações relacionadas a pedidos de clientes.

### Controladores

- **ClienteController**: lida com as requisições relacionadas à criação e validação de clientes.
- **EmailController**: responsável pelo envio e listagem de e-mails.
  
### Repositórios

Os repositórios utilizam **Spring Data JPA** para comunicação com o banco de dados:

- **ClienteRepository**
- **EmailRepository**
- **ProdutoRepository**
- **PedidoRepository**

## Endpoints

- **/clientes**: para criar e listar clientes.
- **/emails**: para criar e listar e-mails.

## Pré-requisitos

- **Java 17** ou superior.
- **Maven** para gerenciamento de dependências.
- **PostgreSQL** para o banco de dados.
- **Lombok** instalado no IDE para evitar erros de compilação relacionados ao projeto.

## Configuração

1. Clone este repositório.
2. Configure o banco de dados PostgreSQL e ajuste as credenciais no arquivo `application.properties`.
3. Execute o comando `mvn clean install` para baixar as dependências e compilar o projeto.
4. Inicie o projeto usando o comando `mvn spring-boot:run`.

## Observações

Este sistema foi desenvolvido com foco em validação rigorosa de dados, como a verificação de CPFs, além de seguir boas práticas de desenvolvimento com o uso de serviços e repositórios. 

Se você encontrar problemas ou tiver sugestões, sinta-se à vontade para abrir uma .

## Autor

GabrielDev - Desenvolvedor Back-End apaixonado por tecnologia.

