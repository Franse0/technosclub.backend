package com.technosclub.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.technosclub.model.Noticias;
import com.technosclub.service.NoticiasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/noticia")
@CrossOrigin(origins = "http://localhost:4200")

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
    public Optional<Noticias> verNoticia(@PathVariable Long id){
        return  noticiasService.verNoticia(id);
    }

    @DeleteMapping("/noticia/borrar/{id}")
    public void borrarNoticia(@PathVariable Long id){
        noticiasService.borrarNoticia(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/noticia")
    public void crearNoticia(@RequestBody Noticias noticias){
        noticiasService.nuevaNoticia(noticias);
    }


}
