package com.technosclub.service;

import com.technosclub.model.Lugares;
import com.technosclub.respository.LugaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LugaresService implements ILugaresService{

    @Autowired
    public LugaresRepository lugaresRepo;
    @Override
    public List<Lugares> verLugares() {
        return lugaresRepo.findAll();
    }

    @Override
    public Lugares verLugar(Long id) {
        return lugaresRepo.getById(id);
    }

    @Override
    public void borrarLugar(Long id) {
        lugaresRepo.deleteById(id);
    }

    @Override
    public void nuevoLugar(Lugares lugar) {
        lugaresRepo.save(lugar);
    }
}
