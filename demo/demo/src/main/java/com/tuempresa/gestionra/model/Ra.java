package com.tuempresa.gestionra.model;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "resultados_aprendizaje") // Asegúrate de que tu tabla se llama así
@Data
public class Ra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Pon aquí los nombres de columnas exactos de tu tabla
    private String descripcion; 
    
    // Si tu tabla tiene campo 'codigo', descomenta esto:
    // private String codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_asignatura") // <--- ¡IMPORTANTE! Revisa este nombre en tu MySQL
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Evita errores al convertir a JSON
    private Materia materia;
}