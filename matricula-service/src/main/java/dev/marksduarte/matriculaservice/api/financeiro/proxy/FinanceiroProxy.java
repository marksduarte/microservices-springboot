package dev.marksduarte.matriculaservice.api.financeiro.proxy;

import dev.marksduarte.matriculaservice.api.financeiro.response.Parcela;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "financeiro-service")
public interface FinanceiroProxy {

    @GetMapping("financeiro/parcelas/{matriculaId}")
    List<Parcela> getParcelas(@PathVariable("matriculaId") Long matriculaId);
}
