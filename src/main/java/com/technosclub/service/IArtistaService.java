package com.technosclub.service;

import com.technosclub.model.Artista;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IArtistaService {

    public Optional<Artista> verArtista(Long id);

    public List<Artista> verArtistas();
    public void nuevoArtista(Artista artista);
    public void borrarArtista(long id);
    public List<Artista> buscarPorNombre(String nombre);



}
