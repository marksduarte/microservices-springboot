package dev.marksduarte.matriculaservice.service;

import dev.marksduarte.matriculaservice.api.financeiro.proxy.FinanceiroProxy;
import dev.marksduarte.matriculaservice.model.Matricula;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MatriculaService {

    private final EnvironmentService environmentService;
    private final FinanceiroProxy financeiroProxy;
    private final AtomicLong idCounter = new AtomicLong();

    public MatriculaService(EnvironmentService environmentService, FinanceiroProxy financeiroProxy) {
        this.environmentService = environmentService;
        this.financeiroProxy = financeiroProxy;
    }

    public Matricula getMatricula() {
        var id = idCounter.incrementAndGet();
        var matricula = new Matricula(id, "Aluno " + id, LocalDate.now(), environmentService.getLocalServerPort());
        var parcelas = financeiroProxy.getParcelas(matricula.getId());
        matricula.setParcelas(parcelas);
        return matricula;
    }
}
