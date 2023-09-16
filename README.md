<h1 align="center">
  <br>
  <a href="https://github.com/marksduarte/microservices-springboot">
  <img src="https://marksduarte.dev/img/logo.png" alt="Markdownify" width="200" style="border-radius: 50%"></a>
  <br>
  Microservices 💚 Springboot
  <br>
</h1>

<h4 align="center">Exemplos de microsserviços utilizando <a href="https://spring.io">spring boot</a>.</h4>

As instâncias de microsserviços são gerenciadas pelo [naming-server](https://github.com/marksduarte/microservices-springboot/tree/main/naming-server),
suas rotas monitoradas e redirecionadas com o loadbalancer do [api-gateway](https://github.com/marksduarte/microservices-springboot/tree/main/api-gateway).  
Já a comunicação entre os serviços é feita utilizando o proxy do OpenFeign e seus arquivos de configuração obtidos por intermédio do [config-server](https://github.com/marksduarte/microservices-springboot/tree/main/config-server).

## Tecnologias

- [Java 17](https://openjdk.org/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)
- [Spring Cloud Config Server](https://spring.io/projects/spring-cloud-config)
- [Spring Cloud Eureka Server](https://spring.io/projects/spring-cloud-netflix)

## Como Executar
- Clonar o repositório;
- Construir os projetos:
```
$ ./mvnw clean package
```
- Executar as aplicações:
```
$ java -jar target/config-server-0.0.1-SNAPSHOT.jar
```
