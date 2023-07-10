package com.technosclub.service;

import com.technosclub.model.Fiesta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IFiestaService {
    public List<Fiesta>verFiestas();
    public Fiesta verFiesta(Long id);
    public void borrarFiesta(long id);
    public void nuevaFiesta(Fiesta fiesta);

}
