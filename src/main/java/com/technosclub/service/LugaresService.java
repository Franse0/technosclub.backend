package com.technosclub.service;

import com.technosclub.model.Lugares;
import com.technosclub.respository.LugaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class LugaresService implements ILugaresService{

    @Autowired
    public LugaresRepository lugaresRepo;
    @Override
    public List<Lugares> verLugares() {
        return lugaresRepo.findAll();
    }

    @Override
    public Optional<Lugares> verLugar(Long id) {
        return lugaresRepo.findById(id);
    }

    @Override
    public void borrarLugar(Long id) {
        lugaresRepo.deleteById(id);
    }

    @Override
    public void nuevoLugar(Lugares lugar) {
        lugaresRepo.save(lugar);
    }

    public List<Lugares>buscarLugaresNombreUbicacion(@PathVariable String parametro){
        return lugaresRepo.buscarLugaresIgnoreCase(parametro);
    }
}

