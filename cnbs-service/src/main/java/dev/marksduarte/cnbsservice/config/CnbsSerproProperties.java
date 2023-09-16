package dev.marksduarte.cnbsservice.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Component
@RefreshScope // Recebe a atualização das propriedades dinamicamente, caso sejam alteradas no Config Server.
@ConfigurationProperties(prefix = "cnbs-serpro")
public class CnbsSerproProperties implements Serializable {
    private String url;
    private String urlItemPorPalavra;

    private String urlMaterial;
    private String urlMaterialPorCodigo;
    private String urlMaterialPorPalavra;
    private String urlMaterialCaracteristicaValorPorPDM;
    private String urlMaterialClassificacaoContabilPorPdm;

    private String urlMaterialCaracteristicasPorPDM;

    private String urlServico;
    private String urlServicoPorCodigo;
    private String urlServicoPorPalavra;
    private String urlServicoClassificacaoContabilPorCodigo;
}
