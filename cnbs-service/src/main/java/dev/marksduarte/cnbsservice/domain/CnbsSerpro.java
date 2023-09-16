package dev.marksduarte.cnbsservice.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CnbsSerpro {
    private Long codigoClasse;
    private Long codigoGrupo;
    private String nomeClasse;
    private Boolean statusGrupo;

}
