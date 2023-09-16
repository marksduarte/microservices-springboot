package dev.marksduarte.cnbsservice.proxy;

import dev.marksduarte.cnbsservice.domain.item.CnbsSerproItem;
import dev.marksduarte.cnbsservice.domain.material.CnbsSerproMaterial;
import dev.marksduarte.cnbsservice.domain.servico.CnbsSerproServico;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "cnbs-serpro", url = "${cnbs-serpro.url}")
public interface CnbsSerproProxy {

    @GetMapping(value = "${cnbs-serpro.url-item}")
    List<CnbsSerproItem> getItens(@RequestParam("palavra") String palavra);

    @GetMapping(value = "${cnbs-serpro.url-material-por-palavra}")
    List<CnbsSerproMaterial> getMateriais(@RequestParam("palavra") String palavra);

    @GetMapping(value = "${cnbs-serpro.url-servico-por-palavra}")
    List<CnbsSerproServico> getServicos(@RequestParam("palavra") String palavra);
}
