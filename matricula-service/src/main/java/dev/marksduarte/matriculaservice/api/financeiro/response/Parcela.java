package dev.marksduarte.matriculaservice.api.financeiro.response;

import java.time.LocalDate;

public record Parcela(LocalDate dataVencimento, Double valor, String enviroment) {
}
