package dev.marksduarte.apigateway.config;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ApiGatewayConfig {

//    @Bean
//    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//        Function<PredicateSpec, Buildable<Route>> routeGet = p -> p.path("/get").uri("http://httpbin.org:80");
//        /* Faz o redirecionamento do nome_servico/context_path para somente o nome_servico no load balance.
//        Ex: http://localhost:8765/cnbs-serpro-client/itens?query=carro */
//        Function<PredicateSpec, Buildable<Route>> routeCnbs = r -> r.path("/cnbs/**").uri("lb://cnbs-service");
//        Function<PredicateSpec, Buildable<Route>> routeMatricula = r -> r.path("/matricula/**").uri("lb://matricula-service");
//        Function<PredicateSpec, Buildable<Route>> routeFinanceiro = r -> r.path("/financeiro/**").uri("lb://financeiro-service");
//        return builder.routes()
//                .route(routeGet)
//                .route(routeCnbs)
//                .route(routeMatricula)
//                .route(routeFinanceiro)
//                .build();
//    }
}
