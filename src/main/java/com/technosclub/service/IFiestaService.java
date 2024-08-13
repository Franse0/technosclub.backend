package com.technosclub.service;

import com.technosclub.model.Fiesta;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IFiestaService {
    public List<Fiesta>verFiestas();

    Optional<Fiesta> verFiesta(long id);

    public void borrarFiesta(long id);
    public void nuevaFiesta(Fiesta fiesta);

}
