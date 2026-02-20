package com.tuempresa.gestionra.model;

import jakarta.persistence.*;
import lombok.Data;
// Si no te funciona @Data (Lombok), borra esa línea y genera los Getters/Setters manualmente (Alt+Insert)

@Entity
@Table(name = "asignaturas") // ¡IMPORTANTE! Esto conecta la clase 'Materia' con tu tabla vieja 'asignaturas'

public class Materia {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre") // Coincide con la columna de tu BBDD
    private String nombre;

    @Column(name = "codigo") // En tu RA6 usabas 'codigo', aquí lo mantenemos
    private String codigo;

    // Aquí pondremos la relación con los RAs más adelante
    // @OneToMany...
}