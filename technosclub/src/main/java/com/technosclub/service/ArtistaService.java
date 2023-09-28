package com.technosclub.service;


import com.technosclub.model.Artista;
import com.technosclub.respository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService implements IArtistaService {

    @Autowired
    public ArtistaRepository artistaRepository;

    @Override
    public Optional<Artista> verArtista(Long id) {
        return artistaRepository.findById(id);
    }


    @Override
    public List<Artista> verArtistas() {
        return artistaRepository.findAll();
    }

    @Override
    public void nuevoArtista(Artista artista) {
    artistaRepository.save(artista);
    }


    @Override
    public void borrarArtista(long id) {
    artistaRepository.deleteById(id);
    }
}
