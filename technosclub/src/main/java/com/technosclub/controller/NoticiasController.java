package com.technosclub.controller;

import com.technosclub.model.Noticias;
import com.technosclub.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class NoticiasController {

    @Autowired
    private NoticiasService noticiasService;

    @GetMapping("/noticias")
    @ResponseBody
    public List<Noticias>verNoticias(){
        return noticiasService.verNoticias();
    }

    @GetMapping("/noticia/{id}")
    @ResponseBody
    public Noticias verNoticia(@PathVariable Long id){
        return noticiasService.verNoticia(id);
    }

    @DeleteMapping("/noticia/borrar/{id}")
    public void borrarNoticia(@PathVariable Long id){
        noticiasService.borrarNoticia(id);
    }


    @PostMapping("/noticia")
    public void nuevaNoticia(@RequestBody Noticias noticia){
        noticiasService.nuevaNoticia(noticia);
    }

}
