package com.technosclub.controller;

import com.technosclub.model.Lugares;
import com.technosclub.service.LugaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Lugares verLugar(@PathVariable Long id){
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
}
