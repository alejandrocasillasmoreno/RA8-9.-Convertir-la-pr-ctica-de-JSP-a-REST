package com.tuempresa.gestionra.controller;

import com.tuempresa.gestionra.model.Materia;
import com.tuempresa.gestionra.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que esta clase responde con datos (JSON), no con vistas HTML
@RequestMapping("/api/materias") // La URL base será: http://localhost:8080/api/materias
public class MateriaController {

    @Autowired
    private MateriaService servicio;

    // GET: Obtener todas las materias
    @GetMapping
    public List<Materia> listar() {
        return servicio.listarTodas();
    }

    // POST: Guardar una nueva materia
    @PostMapping
    public Materia guardar(@RequestBody Materia materia) {
        // @RequestBody convierte el JSON que envíes en un objeto Java
        return servicio.guardar(materia);
    }
    
    // PUT: Editar una materia existente
    @PutMapping("/{id}")
    public Materia editar(@PathVariable Long id, @RequestBody Materia materia) {
        Materia materiaExistente = servicio.obtenerPorId(id);
        if (materiaExistente != null) {
            materiaExistente.setNombre(materia.getNombre());
            materiaExistente.setCodigo(materia.getCodigo());
            return servicio.guardar(materiaExistente);
        }
        return null; // O podrías lanzar un error 404
    }

    // DELETE: Borrar por ID
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
    }
}