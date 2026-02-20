package com.tuempresa.gestionra.service;

import com.tuempresa.gestionra.model.Criterio;
import com.tuempresa.gestionra.repository.CriterioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CriterioService {

    @Autowired
    private CriterioRepository repositorio;

    public List<Criterio> listarTodos() {
        return repositorio.findAll();
    }

    public List<Criterio> listarPorRa(Long idRa) {
        return repositorio.findByRaId(idRa);
    }

    public Criterio guardar(Criterio criterio) {
        return repositorio.save(criterio);
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
    
    public Optional<Criterio> obtenerPorId(Long id) {
        return repositorio.findById(id);
    }
}