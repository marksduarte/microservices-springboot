package dev.marksduarte.financeiroservice.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Parcela implements Serializable {

    private Long id;
    private LocalDate dataVencimento;
    private Double valor;
    private Long matriculaId;
    private String enviroment;

    public Parcela(Long id, LocalDate dataParcela, Double valor, Long matriculaId, String enviroment) {
        this.id = id;
        this.dataVencimento = dataParcela;
        this.valor = valor;
        this.matriculaId = matriculaId;
        this.enviroment = "Financeiro Port: " + enviroment;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public Double getValor() {
        return valor;
    }

    public Long getMatriculaId() {
        return matriculaId;
    }

    public String getEnviroment() {
        return enviroment;
    }
}
