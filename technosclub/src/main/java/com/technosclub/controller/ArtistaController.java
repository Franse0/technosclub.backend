package com.technosclub.controller;

import com.technosclub.model.Artista;
import com.technosclub.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @GetMapping("/artistas")
    @ResponseBody
    public List<Artista> verArtistas(){
        return  artistaService.verArtistas();
    }

    @GetMapping("/artista/{id}")
    @ResponseBody
    public Optional<Artista> verArtista(@PathVariable Long id){
        return  artistaService.verArtista(id);
    }


    @PostMapping("artista")
    public void nuevoArtista(@RequestBody Artista artista){
        artistaService.nuevoArtista(artista);
    }

    @DeleteMapping("/artista/borrar/{id}")
    public void borrarArtista(@PathVariable long id){
        artistaService.borrarArtista(id);
    }
}
