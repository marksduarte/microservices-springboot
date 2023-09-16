package dev.marksduarte.matriculaservice.controller;

import dev.marksduarte.matriculaservice.model.Matricula;
import dev.marksduarte.matriculaservice.service.MatriculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MatriculaController {

    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Matricula> getMatricula() {
        return ResponseEntity.ok(service.getMatricula());
    }
}
