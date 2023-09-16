<h1 align="center">
  <br>
  <a href="https://github.com/marksduarte/microservices-springboot">
  <img src="https://marksduarte.dev/img/logo.png" alt="Markdownify" width="200" style="border-radius: 50%"></a>
  <br>
  Microservices 💚 Springboot
  <br>
</h1>

<h4 align="center">Exemplos de microsserviços utilizando <a href="https://spring.io">spring boot</a>.</h4>

## Tecnologias

- [Java 17](https://openjdk.org/)
- [Maven](https://maven.apache.org/)
- [Gradle](https://gradle.org/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Spring Cloud Config Server](https://spring.io/projects/spring-cloud-config)

## Como Executar
- Clonar repositório.

### config-server
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/config-server-0.0.1-SNAPSHOT.jar
```

### naming-server
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/naming-server-0.0.1-SNAPSHOT.jar
```

### cnbs-serpro-client
- Construir o projeto:
```
$ ./gradlew build
```
- Executar a aplicação:
```
$ java -jar build/libs/cnbs-serpro-client-0.0.1-SNAPSHOT.jar
```
