package dev.marksduarte.matriculaservice.api.financeiro.proxy;

import dev.marksduarte.matriculaservice.api.financeiro.response.Parcela;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "financeiro-service")
public interface FinanceiroProxy {

    String FINANCEIRO_SERVICE = "financeiroService";

    @Retry(name = FINANCEIRO_SERVICE)
    @Bulkhead(name = FINANCEIRO_SERVICE)
    @CircuitBreaker(name = FINANCEIRO_SERVICE, fallbackMethod = "getParcelasFallback")
    @GetMapping("financeiro/parcelas/{matriculaId}")
    List<Parcela> getParcelas(@PathVariable("matriculaId") Long matriculaId);

    default List<Parcela> getParcelasFallback(Exception e) {
        System.err.println("Não foi possível obter as parcelas: " + e.getMessage());
        return List.of();
    }

}
