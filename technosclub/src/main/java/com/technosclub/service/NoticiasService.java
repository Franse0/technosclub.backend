package com.technosclub.service;

import com.technosclub.model.Noticias;
import com.technosclub.respository.NoticiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiasService implements INoticiasService {

    @Autowired
    public NoticiasRepository noticiasRepo;
    @Override
    public List<Noticias> verNoticias() {
        return noticiasRepo.findAll();
    }

    @Override
    public Optional<Noticias> verNoticia(Long id) {
        return noticiasRepo.findById(id);
    }

    @Override
    public void borrarNoticia(Long id) {
        noticiasRepo.deleteById(id);
    }

    @Override
    public void nuevaNoticia(Noticias noticia) {
        noticiasRepo.save(noticia);
    }
}
