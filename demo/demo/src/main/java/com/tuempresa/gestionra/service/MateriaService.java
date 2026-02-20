package com.tuempresa.gestionra.service;

import com.tuempresa.gestionra.model.Materia;
import com.tuempresa.gestionra.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository repositorio;

    // 1. Listar todas
    public List<Materia> listarTodas() {
        return repositorio.findAll();
    }

    // 2. Guardar (Crear o Editar)
    public Materia guardar(Materia materia) {
        return repositorio.save(materia);
    }

    // 3. Eliminar
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
    
    // 4. Buscar por ID (necesario para editar)
    public Materia obtenerPorId(Long id) {
        return repositorio.findById(id).orElse(null);
    }
}