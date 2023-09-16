package dev.marksduarte.financeiroservice.controller;

import dev.marksduarte.financeiroservice.model.Parcela;
import dev.marksduarte.financeiroservice.service.ParcelaService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "parcelas", produces = MediaType.APPLICATION_JSON_VALUE)
public class ParcelaController {

    private final ParcelaService service;

    public ParcelaController(ParcelaService service) {
        this.service = service;
    }

    @GetMapping("{matriculaId}")
    public ResponseEntity<List<Parcela>> getByMatriculaId(@PathVariable("matriculaId") Long matriculaId) {
        return ResponseEntity.ok(service.getParcelasByMatricula(matriculaId));
    }
}
