package com.technosclub.controller;

import com.technosclub.model.Entidad;
import com.technosclub.respository.EntidadRepository;
import com.technosclub.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")



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
    public void nuevaEntidad(@RequestBody Entidad entidad) {
        // Verifica si la cadena de imgs no es nula ni vacía
        if (entidad.getImg_list() != null && !entidad.getImg_list().isEmpty()) {
            // Divide la cadena y establece la lista resultante en el modelo usando el método setImgs
            List<String> imgsList = Arrays.asList(entidad.getImg_list().split(","));
            entidad.setImgs(imgsList);
        }

        // Llama al servicio para agregar la entidad
        entidadService.nuevoEntidad(entidad);
    }


    @DeleteMapping("/entidad/borrar/{id}")
    public void borrarEntidad(@PathVariable Long id){
        entidadService.borrarEntidad(id);
    }

    @GetMapping("/entidad/buscar/{parametro}")
    public ResponseEntity<List<Entidad>>buscarEntidad(@PathVariable String parametro){
        List<Entidad> resultados = entidadService.buscarEntidadPorNombre(parametro);
        return ResponseEntity.ok(resultados);
    }
}
