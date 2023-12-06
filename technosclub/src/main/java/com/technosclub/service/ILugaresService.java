package com.technosclub.service;

import com.technosclub.model.Lugares;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public interface ILugaresService {

    public List<Lugares> verLugares();
    public Optional<Lugares> verLugar(Long id);
    public void borrarLugar(Long id);
    public void nuevoLugar(Lugares lugar);
}
