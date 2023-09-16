package dev.marksduarte.cnbsservice.service;


import dev.marksduarte.cnbsservice.controller.CnbsSerproSearchFilter;
import dev.marksduarte.cnbsservice.domain.item.CnbsSerproItem;
import dev.marksduarte.cnbsservice.domain.material.CnbsSerproMaterial;
import dev.marksduarte.cnbsservice.domain.servico.CnbsSerproServico;
import dev.marksduarte.cnbsservice.proxy.CnbsSerproProxy;
import jakarta.validation.constraints.NotNull;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class CnbsSerproService {

    private final CnbsSerproProxy proxy;
    private final EnvironmentService environmentService;

    public CnbsSerproService(CnbsSerproProxy proxy, EnvironmentService environmentService) {
        this.proxy = proxy;
        this.environmentService = environmentService;
    }

    /**
     * Lista de Materiais e Serviços resumidos.
     *
     * @param searchFilter é obrigatório.
     * @return {@link List} de {@link CnbsSerproItem}
     */
    public List<CnbsSerproItem> getItens(@NotNull CnbsSerproSearchFilter searchFilter) {
        var port = environmentService.getLocalServerPort();
        var itens = proxy.getItens(searchFilter.query());
        itens.forEach(i -> i.setEnviroment(port));
        return itens;
    }

    /**
     * Pesquisar por Materiais.
     *
     * @param searchFilter é obrigatório.
     * @return {@link List} de {@link CnbsSerproMaterial}
     */
    public List<CnbsSerproMaterial> getMateriais(@NotNull CnbsSerproSearchFilter searchFilter) {
        return proxy.getMateriais(searchFilter.query());
    }

    /**
     * Pesquisar por Serviços.
     *
     * @param searchFilter é obrigatório.
     * @return {@link List} de {@link CnbsSerproServico}
     */
    public List<CnbsSerproServico> getServicos(@NotNull CnbsSerproSearchFilter searchFilter) {
        return proxy.getServicos(searchFilter.query());
    }

}
