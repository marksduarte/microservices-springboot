package dev.marksduarte.cnbsservice.controller;

import dev.marksduarte.cnbsservice.domain.item.CnbsSerproItem;
import dev.marksduarte.cnbsservice.domain.material.CnbsSerproMaterial;
import dev.marksduarte.cnbsservice.domain.servico.CnbsSerproServico;
import dev.marksduarte.cnbsservice.service.CnbsSerproService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Tag(name = "CNBS Endpoint")
@Log4j2
@RestController
@RequestMapping(value = "/")
public class CnbsSerproController {

    @Autowired
    private CnbsSerproService service;

    @Operation(summary = "Lista os itens resumidos por palavra.")
    @ApiResponse(responseCode = "200", description = "Itens localizados.",
            content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = CnbsSerproItem.class))})
    @GetMapping("itens")
    public ResponseEntity<List<CnbsSerproItem>> getItens(@Valid CnbsSerproSearchFilter searchFilter) {
        return ResponseEntity.ok(service.getItens(searchFilter));
    }

    @Operation(summary = "Lista os materiais por palavra.")
    @GetMapping("materiais")
    public ResponseEntity<List<CnbsSerproMaterial>> getMateriais(@Valid CnbsSerproSearchFilter searchFilter) {
        return ResponseEntity.ok(service.getMateriais(searchFilter));
    }

    @Operation(summary = "Lista os serviços por palavra.")
    @GetMapping("servicos")
    public ResponseEntity<List<CnbsSerproServico>> getServicos(@Valid CnbsSerproSearchFilter searchFilter) {
        return ResponseEntity.ok(service.getServicos(searchFilter));
    }

}
