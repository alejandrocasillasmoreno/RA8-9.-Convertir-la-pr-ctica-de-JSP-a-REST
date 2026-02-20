package com.tuempresa.gestionra.service;



import com.tuempresa.gestionra.model.Ra;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

import com.tuempresa.gestionra.repository.RaRepository;



@Service

public class RaService {



    @Autowired

    private RaRepository repositorio;



    public List<Ra> listarTodos() {

        return repositorio.findAll();

    }



    public List<Ra> listarPorMateria(Long idMateria) {

        return repositorio.findByMateriaId(idMateria);

    }



    public Ra guardar(Ra ra) {

        return repositorio.save(ra);

    }



    public void eliminar(Long id) {

        repositorio.deleteById(id);

    }

    

    public Optional<Ra> obtenerPorId(Long id) {

        return repositorio.findById(id);

    }

}