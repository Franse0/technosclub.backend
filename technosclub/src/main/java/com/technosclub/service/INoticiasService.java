package com.technosclub.service;

import com.technosclub.model.Noticias;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface INoticiasService {

    public List<Noticias>verNoticias();
    public Noticias verNoticia(Long id);
    public void borrarNoticia(Long id);

    public void nuevaNoticia(Noticias noticia);
}
