package dev.marksduarte.financeiroservice.service;

import dev.marksduarte.financeiroservice.model.Parcela;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ParcelaService {

    private final EnvironmentService environmentService;

    public ParcelaService(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public List<Parcela> getParcelasByMatricula(Long matriculaId) {
        var hoje = LocalDate.now();
        var port = environmentService.getLocalServerPort();
        return List.of(
                new Parcela(1L, hoje, 350.00, matriculaId, port),
                new Parcela(2L, hoje.plusMonths(1), 350.00, matriculaId, port));
    }
}
