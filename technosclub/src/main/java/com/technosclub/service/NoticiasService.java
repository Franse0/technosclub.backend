package com.technosclub.service;

import com.technosclub.model.Noticias;
import com.technosclub.respository.NoticiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoticiasService implements INoticiasService {

    @Autowired
    public NoticiasRepository noticiasRepo;
    @Override
    public List<Noticias> verNoticias() {
        return noticiasRepo.findAll();
    }

    @Override
    public Noticias verNoticia(Long id) {
        return noticiasRepo.getById(id);
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
