package dev.marksduarte.apigateway.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@OpenAPIDefinition(info = @Info(title = "API Gateway Service", version = "1.0", description = "Documentação do API Gateway v1.0"))
public class OpenAPIConfig {

    private final Logger logger = LoggerFactory.getLogger(OpenAPIConfig.class);

    @Bean
    @Lazy(value = false) // Tem que ser carregado na inicialização da aplicação.
    public List<GroupedOpenApi> apis(SwaggerUiConfigParameters parameters, RouteDefinitionLocator locator) {
        // .block para bloquear o arquivo durante a leitura.
        var definitions = locator.getRouteDefinitions().collectList().block();
        if (definitions != null) {
            definitions.stream()
                    .filter(routeDefinition -> routeDefinition.getId().matches(".*-service"))
                    .forEach(rd -> {
                        var name = rd.getId();
                        logger.info("Registrando serviço {} no Swagger.", name);
                        parameters.addGroup(name);
                        GroupedOpenApi.builder().pathsToMatch("/" + name + "/**").group(name).build();
                    });
        }
        return new ArrayList<>();
    }
}
