package com.tuempresa.gestionra.controller;

import com.tuempresa.gestionra.model.Ra;
import com.tuempresa.gestionra.service.RaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ras")
public class RaController {

    @Autowired
    private RaService servicio;

    @GetMapping
    public List<Ra> listarTodos() {
        return servicio.listarTodos();
    }
    
    // Ejemplo: /api/ras/materia/1  -> Devuelve los RAs de la asignatura 1
    @GetMapping("/materia/{idMateria}")
    public List<Ra> listarPorMateria(@PathVariable Long idMateria) {
        return servicio.listarPorMateria(idMateria);
    }

    @PostMapping
    public Ra guardar(@RequestBody Ra ra) {
        return servicio.guardar(ra);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}