package dev.marksduarte.cnbsservice.controller;

import dev.marksduarte.cnbsservice.domain.item.CnbsSerproItem;
import dev.marksduarte.cnbsservice.domain.material.CnbsSerproMaterial;
import dev.marksduarte.cnbsservice.domain.servico.CnbsSerproServico;
import dev.marksduarte.cnbsservice.service.CnbsSerproService;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Log4j2
@RestController
@RequestMapping(value = "/")
public class CnbsSerproController {

    @Autowired
    private CnbsSerproService service;

    @GetMapping("itens")
    public ResponseEntity<List<CnbsSerproItem>> getItens(@Valid CnbsSerproSearchFilter searchFilter) {
        return ResponseEntity.ok(service.getItens(searchFilter));
    }

    @GetMapping("materiais")
    public ResponseEntity<List<CnbsSerproMaterial>> getMateriais(@Valid CnbsSerproSearchFilter searchFilter) {
        return ResponseEntity.ok(service.getMateriais(searchFilter));
    }

    @GetMapping("servicos")
    public ResponseEntity<List<CnbsSerproServico>> getServicos(@Valid CnbsSerproSearchFilter searchFilter) {
        return ResponseEntity.ok(service.getServicos(searchFilter));
    }

}
