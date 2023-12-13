package com.technosclub.controller;

import com.technosclub.model.Lugares;
import com.technosclub.service.LugaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class LugaresController {


    @Autowired
    private LugaresService lugaresService;

    @GetMapping("/lugares")
    @ResponseBody
    public List<Lugares> verLugares(){
        return lugaresService.verLugares();
    }
    @GetMapping("/lugar/{id}")
    @ResponseBody
    public Optional<Lugares> verLugar(@PathVariable Long id){
        return  lugaresService.verLugar(id);
    }
    @PostMapping("/lugar")
    public void nuevoLugar(@RequestBody Lugares lugar){
        lugaresService.nuevoLugar(lugar);
    }

    @DeleteMapping("/lugar/borrar/{id}")
    public void borrarLugar(@PathVariable Long id){
        lugaresService.borrarLugar(id);
    }

    @GetMapping("/lugar/buscar/{parametro}")
    public ResponseEntity<List<Lugares>>buscarLugares(@PathVariable String parametro){
        List<Lugares> resultados = lugaresService.buscarLugaresNombreUbicacion(parametro);
        return ResponseEntity.ok(resultados);
    }
}
