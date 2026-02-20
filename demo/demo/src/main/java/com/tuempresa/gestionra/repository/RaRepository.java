package com.tuempresa.gestionra.repository;

import com.tuempresa.gestionra.model.Ra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RaRepository extends JpaRepository<Ra, Long> {
    // Busca todos los RA que pertenezcan a una asignatura concreta
    List<Ra> findByMateriaId(Long materiaId);
}