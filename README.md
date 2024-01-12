# api-cadastro-nota

### Tecnologias utilizadas:

* Java 17
* Maven
* Framework Spring (boot, data, mvc)
* JPA/Hibernate
* Postgres
* Redis
* Flyway (controle de versionamento do banco)
* JUnit
* H2 (Teste Containers)
* APIs Rest
* Swagger
* Spring Actuator
* Docker
* SonarQube

### Arquitetura do Projeto:
* Hexagonal com Spring Boot

### Para executar o projeto, siga os seguintes passos:

* Realize o clone do repositório e dentro da IDE desejada;
* Instalar o Docker CLI na máquina, ou Docker Desktop caso utilize Windows
* Executar o build do projeto
* Pelo terminal, Navegue até a raiz da pasta onde foi clonado o projeto, e rodar os seguinte comando:`docker-compose up -d --build`
* Após verificar que os containeres estão em execução, acesse a URI http://localhost:8081/swagger-ui/index.html#/
* Caso deseje rodar pela IDE, é preciso parar a execução do container da aplicação. Após isso rode a aplicação na IDE, e assim que ela subir com sucesso, acesse a mesma URI acima.

### Para rodar Api com Docker:

* Criar imagem: `docker build . -t api-cadastro-notas:latest`
* Rodar em container: `docker run -p 8080:8080 -d --name api-cadastro-notas` 

### Criar banco:

* Acessar o link do pgadim: http://localhost:5050/browser/
* Assim que abrir inserir a senha: admin
* Criar servers com o nome: api-cadastro-notas
* Usar o username: notas_user
* Usar o password: notas_user_passwd
* Criar Database: db_api_cadastro_notas




