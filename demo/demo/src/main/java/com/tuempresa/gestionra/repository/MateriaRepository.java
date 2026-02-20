package com.tuempresa.gestionra.repository; // <--- FÍJATE AQUÍ

import com.tuempresa.gestionra.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}