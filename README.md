# Sobre o projeto
Essa aplicação é um projeto web services com Spring Boot e JPA / Hibernate construído para fins didáticos!
Com o projeto rodando junto ao banco de dados de teste (H2), e a população artificial dele no arquivo ".../course/config/TestConfig.java",
é possível testar e utilizar toda implementação CRUD desenvolvida.

## Modelo conceitual

![image](https://github.com/user-attachments/assets/b9cd50bd-652f-4cc5-b9f0-d98f10daf7e3)

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 DB

## Como executar do projeto
Pré-requisitos: Java 21
~~~
# clonar repositório
git clone https://github.com/gustavostolze/workshop-springboot3-jpa.git

# entrar na pasta raiz do projeto

# executar o projeto
./mvnw spring-boot:run
~~~
## Como testar as requisições
Endpoints disponíveis:
- GET
  - users | users/{id}
  - orders | orders/{id}
  - categories | categories/{id}
  - products | products/{id}
- POST
  - users | JSON body example:

      ~~~~json
      {
         "name": "Bob Brown",
         "email": "bob@gmail.com",
         "phone": "977557755",
         "password": "1234567"
      } 
      ~~~~
- PUT (update)
  - users/{id} | JSON body example:

      ~~~~json
      {
         "name": "Bob Brown",
         "email": "bob@gmail.com",
         "phone": "977557755"
      } 
      ~~~~
- DEL
  - users/{id}

Direitos de imagens e créditos reservados a [DevSuperior](https://devsuperior.com.br/) - Prof. Dr. Nelio Alves - Curso Udemy
