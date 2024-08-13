package com.technosclub.service;

import com.technosclub.model.Artista;
import com.technosclub.model.Entidad;
import com.technosclub.model.Fiesta;
import com.technosclub.respository.EntidadRepository;
import com.technosclub.respository.FiestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntidadService implements IEntidadService {
    @Autowired
    public EntidadRepository entidadRepository;

    @Override
    public Optional<Entidad> verEntidad(Long id) {
        return entidadRepository.findById(id);
    }

    @Override
    public List<Entidad> verEntidades(){
        return entidadRepository.findAll();
    }

    @Override
    public void nuevoEntidad(Entidad entidad) {
        entidadRepository.save(entidad);
    }

    @Override
    public void borrarEntidad(long id) {
        entidadRepository.deleteById(id);
    }


    public List<Entidad>buscarEntidadPorNombre(String nombre){
        return entidadRepository.buscarPorNombreIgnoreCase(nombre);
    }
}
