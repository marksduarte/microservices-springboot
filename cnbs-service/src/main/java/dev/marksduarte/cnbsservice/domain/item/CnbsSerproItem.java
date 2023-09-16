package dev.marksduarte.cnbsservice.domain.item;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class CnbsSerproItem {

    private String id;
    private String codigo;
    private String codigoMaterial;

    private String nome;
    private String descricao;
    private CatSerproTipoItem tipo;
    private String enviroment;
}
