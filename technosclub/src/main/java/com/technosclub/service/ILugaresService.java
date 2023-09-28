package com.technosclub.service;

import com.technosclub.model.Lugares;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface ILugaresService {

    public List<Lugares> verLugares();
    public Lugares verLugar(Long id);
    public void borrarLugar(Long id);
    public void nuevoLugar(Lugares lugar);
}
