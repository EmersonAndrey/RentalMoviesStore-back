# 🎬 Rental Movies Store – Backend

Este é o **back-end** da aplicação **Rental Movies Store**, um sistema que funciona como uma agenda de catálogos de filmes favoritos. O projeto utiliza **Java 17** com o framework **Spring Boot** para a criação de uma API RESTful.

🔗 **Vídeo demonstrativo (upado no LinkedIn):**   
[Ver post no LinkedIn](https://www.linkedin.com/feed/update/urn:li:activity:7297731819163049984/)

---

## ✅ Funcionalidades

- 👤 **Usuários**:  
  - Criar  
  - Atualizar  
  - Excluir  
  - Buscar por e-mail  
  - Listar todos (uso interno via API)

---

## 🧱 Tecnologias Utilizadas

🔹 **Frontend**
- ⚛️ React
- 🎨 HTML + CSS
- 🎛️ Bootstrap

🔹 **Backend**
- ☕ Java 17  
- 🧩 Spring Boot

🔹 **DataBase**
- 💾 MySQL

---

## 📦 Requisitos

- Java 17  
- Maven  
- Docker (opcional, para containerização)  

---

## ⚠️ Atenção: Docker Compose está no Repositório do Frontend

Este repositório contém apenas o **back-end** da aplicação.  
O arquivo `docker-compose.yml`, necessário para subir o sistema completo com front e back, está localizado no repositório do front-end:

🔗 [RentalMoviesStore-front](https://github.com/EmersonAndrey/RentalMoviesStore-front)

---

## 🚀 Como Rodar o Projeto Localmente

### 📁 1. Clonar o Repositório

```bash
git clone https://github.com/EmersonAndrey/RentalMoviesStore-back.git
cd RentalMoviesStore-back
```

### 🛠️ 2. Configurar Banco de Dados MySQL

Crie um banco chamado `rentalmovies` no MySQL.

Edite o arquivo `src/main/resources/application.yml` com suas credenciais:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/rentalmovies?useUnicode=true&characterEncoding=UTF-8
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: seu_usuario
    password: sua_senha
```

> 📝 Substitua `seu_usuario` e `sua_senha` pelos dados reais.

---

### 📥 3. Instalar Dependências

```bash
mvn clean install
```

---

### ▶️ 4. Executar a Aplicação

Via Maven:

```bash
./mvnw spring-boot:run
```

Ou via Docker:

```bash
docker build -t rental-back .
docker run -p 8080:8080 rental-back
```

---

## 🔌 Endpoints Principais

Use preferencialmente o **frontend** para interagir com a API.  
Também é possível testar com ferramentas como Postman ou Insomnia.

### 🔐 Usuários

| Método | Endpoint                        | Descrição                  |
|--------|----------------------------------|----------------------------|
| POST   | `/user/save`                    | Cadastra novo usuário      |
| GET    | `/user/findByEmail/{email}`     | Busca usuário por e-mail   |
| DELETE | `/user/delete/{email}`          | Remove usuário             |
| PUT    | `/user/update/{email}`          | Atualiza dados do usuário  |
| GET    | `/user/findAll`                 | Lista todos (uso interno)  |

#### 🧪 Exemplo de requisição (POST `/user/save`)

```json
{
  "name": "Cliente",
  "email": "cliente@gmail.com",
  "password": "123"
}
```

---

## 🧩 Integração com o Frontend

Para executar o sistema completo, clone e rode também o frontend:

🔗 [Repositório do Frontend](https://github.com/EmersonAndrey/RentalMoviesStore-front)

---

## 👨‍💻 Desenvolvedor

**Emerson Andrey Fausto dos Santos**  
