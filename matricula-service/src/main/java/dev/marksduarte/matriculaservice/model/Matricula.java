package dev.marksduarte.matriculaservice.model;

import dev.marksduarte.matriculaservice.api.financeiro.response.Parcela;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Matricula implements Serializable {
    private final Long id;
    private final String aluno;
    private final LocalDate dataMatricula;
    private List<Parcela> parcelas;
    private String enviroment;

    public Matricula(Long id, String aluno, LocalDate dataMatricula, String enviroment) {
        this.id = id;
        this.aluno = aluno;
        this.dataMatricula = dataMatricula;
        this.enviroment = "Matricula Port: " + enviroment;
    }

    public Long getId() {
        return id;
    }

    public String getAluno() {
        return aluno;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public String getEnviroment() {
        return enviroment;
    }
}
