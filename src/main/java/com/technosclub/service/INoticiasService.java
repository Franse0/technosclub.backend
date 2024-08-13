package com.technosclub.service;

import com.technosclub.model.Noticias;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface INoticiasService {

    public List<Noticias>verNoticias();
    public Optional<Noticias> verNoticia(Long id);
    public void borrarNoticia(Long id);

    public void nuevaNoticia(Noticias noticia);
}
