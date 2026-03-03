# 🩺 Vollmed API

Uma API RESTful desenvolvida em **Java (Spring Boot)** para servir como backend da plataforma *Vollmed*, oferecendo endpoints de saúde para gerenciar recursos como médicos, especialidades, consultas, pacientes e autenticação.

## 🚀 Sobre

A *Vollmed API* é uma aplicação backend pensada para ambientes de serviços médicos, permitindo integração com frontends, aplicativos móveis ou sistemas terceiros. Ela fornece endpoints bem definidos para **CRUD** de entidades comuns no domínio de clínicas e consultas médicas.

Esse repositório faz parte de um conjunto de projetos de software educacionais/desenvolvidos para aprendizado e prática profissional.

## 📦 Funcionalidades

- 📄 Endpoints REST para recursos principais
- 🔐 Autenticação e autorização (JWT ou Spring Security)
- 📊 Documentação integrada (Swagger/OpenAPI)
- 💾 Conexão com banco de dados relacional (ex: PostgreSQL, MySQL)
- 🚀 Possibilidade de deploy facilitado (Docker, Heroku, etc.)
- 🧪 Testes unitários e de integração

## 🧠 Pré-requisitos

Antes de começar, você precisa:

- 🔹 Java JDK 17+
- 🔹 Maven 3.6+
- 🔹 Docker *opcional*, para banco
- 🔹 Banco de dados relacional configurado

## 📥 Instalando

1. Clone este repositório:

```bash
git clone https://github.com/CalebeLouGer/vollmed_api.git
````

2. Acesse a pasta:

```bash
cd vollmed_api
```

3. Configure as variáveis de ambiente (exemplo em `.env` ou `application.properties`):

```
SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/vollmed
SPRING_DATASOURCE_USERNAME=seu_usuario
SPRING_DATASOURCE_PASSWORD=sua_senha
JWT_SECRET=sua_chave_secreta
```

4. Compile e rode a aplicação:

```bash
mvn clean install
mvn spring-boot:run
```

## 🛠️ Tecnologias

Este projeto usa:

* 💻 **Java 17**
* 🚀 **Spring Boot**
* 🛠️ **Maven**
* 🗄 **PostgreSQL**
* 📘 **Swagger / OpenAPI** para documentação

## 📄 API Documentação

Ao iniciar o servidor, a documentação interativa estará disponível em:

* 📌 `http://localhost:8080/swagger-ui.html`
* 📌 `http://localhost:8080/v3/api-docs`

Essa interface permite testar todos os endpoints diretamente no navegador.

## 🧪 Testes

Execute os testes com:

```bash
mvn test
```

## ⭐ Exemplos de Endpoints

| Método | Rota                  | Descrição                |
| ------ | --------------------- | ------------------------ |
| GET    | `/api/medicos`        | Lista todos os médicos   |
| GET    | `/api/pacientes`      | Lista pacientes          |
| POST   | `/api/consultas`      | Agenda uma nova consulta |
| PUT    | `/api/consultas/{id}` | Atualiza uma consulta    |
| DELETE | `/api/medicos/{id}`   | Remove um médico         |

*(Esses são exemplos típicos — ajuste conforme as rotas reais da sua API.)*

## 👨‍💻 Contribuindo

Contribuições são bem-vindas! Siga estes passos:

1. Faça um **fork** do projeto.
2. Crie uma **branch**: `git checkout -b feature/nome-da-funcionalidade`
3. Commit suas alterações: `git commit -m "Descrição da melhoria"`
4. Envie a branch: `git push origin feature/nome-da-funcionalidade`
5. Abra um **Pull Request**
