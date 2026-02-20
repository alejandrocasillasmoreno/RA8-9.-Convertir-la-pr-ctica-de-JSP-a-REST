package com.tuempresa.gestionra.model;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "criterios_evaluacion") // <--- REVISA SI TU TABLA MYSQL SE LLAMA ASÍ
@Data
public class Criterio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    // private Double porcentaje; // Descomenta solo si tienes columna porcentaje

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ra") // <--- REVISA QUE ESTA COLUMNA EXISTA EN TU TABLA
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Ra ra;
}