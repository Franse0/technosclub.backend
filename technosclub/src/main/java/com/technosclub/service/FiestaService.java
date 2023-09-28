package com.technosclub.service;

import com.technosclub.model.Fiesta;
import com.technosclub.respository.FiestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FiestaService implements IFiestaService{

    @Autowired
    public FiestaRepository fiestaRepo;
    @Override
    public List<Fiesta> verFiestas() {
        return fiestaRepo.findAll();
    }

    @Override
    public Optional<Fiesta> verFiesta(long id) {
        return fiestaRepo.findById(id);
    }

    @Override
    public void borrarFiesta(long id) {
        fiestaRepo.deleteById(id);
    }

    @Override
    public void nuevaFiesta(Fiesta fiesta) {
        fiestaRepo.save(fiesta);
    }
}
