package com.technosclub.service;

import com.technosclub.model.Registro;

import java.util.List;
import java.util.Optional;

public interface IRegistroService {
    public void nuevoRegistro(Registro registro);
    public void borrarRegistro(Long id);
    public List<Registro>traerRegistros();
    public Optional<Registro>traerRegistro(Long id);
}

