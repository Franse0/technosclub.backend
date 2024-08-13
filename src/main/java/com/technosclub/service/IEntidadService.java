package com.technosclub.service;

import com.technosclub.model.Artista;
import com.technosclub.model.Entidad;

import java.util.List;
import java.util.Optional;

public interface IEntidadService {

    public Optional<Entidad> verEntidad(Long id);

    public List<Entidad> verEntidades();
    public void nuevoEntidad(Entidad entidad);
    public void borrarEntidad(long id);
}
