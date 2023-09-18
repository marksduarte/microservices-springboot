package dev.marksduarte.cnbsservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info =
        @Info(title = "CNBS Service API", description = "Documentação de CNBS Service API", version = "v1"))
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(customInfo());
    }

    private io.swagger.v3.oas.models.info.Info customInfo() {
        return new io.swagger.v3.oas.models.info.Info()
                .title("CNBS Service API")
                .description("Documentação de CNBS Service API")
                .version("v1")
                .license(customLicense());
    }

    private License customLicense() {
        return new License().name("Apache 2.0").url("https://springdoc.org");
    }
}
