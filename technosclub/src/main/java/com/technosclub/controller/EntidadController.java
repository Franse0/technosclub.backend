package com.technosclub.controller;

import com.technosclub.model.Entidad;
import com.technosclub.respository.EntidadRepository;
import com.technosclub.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")


public class EntidadController {

    @Autowired
    private EntidadService entidadService;

    @GetMapping("/entidades")
    @ResponseBody
    public List<Entidad> verEntidades(){
        return entidadService.verEntidades();
    }

    @GetMapping("/entidad/{id}")
    @ResponseBody
    public Optional<Entidad>verEntidad(@PathVariable Long id){
        return entidadService.verEntidad(id);
    }

    @PostMapping("/entidad")
    public void nuevaEntidad(@RequestBody Entidad entidad){
        entidadService.nuevoEntidad(entidad);
    }

    @DeleteMapping("/entidad/borrar/{id}")
    public void borrarEntidad(@PathVariable Long id){
        entidadService.borrarEntidad(id);
    }
}
