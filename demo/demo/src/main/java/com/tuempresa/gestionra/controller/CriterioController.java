package com.tuempresa.gestionra.controller;

import com.tuempresa.gestionra.model.Criterio;
import com.tuempresa.gestionra.service.CriterioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/criterios")
public class CriterioController {

    @Autowired
    private CriterioService servicio;

    @GetMapping
    public List<Criterio> listarTodos() {
        return servicio.listarTodos();
    }

    // Endpoint extra: Ver criterios de un RA específico
    @GetMapping("/ra/{idRa}")
    public List<Criterio> listarPorRa(@PathVariable Long idRa) {
        return servicio.listarPorRa(idRa);
    }

    @PostMapping
    public Criterio guardar(@RequestBody Criterio criterio) {
        return servicio.guardar(criterio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}