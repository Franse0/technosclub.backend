package com.technosclub.controller;

import com.technosclub.model.Fiesta;
import com.technosclub.service.FiestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "**")

public class FiestaController {
    @Autowired
    private FiestaService fiestaService;

    @GetMapping("/fiestas")
    @ResponseBody
    public List<Fiesta>verFiestas(){
        return fiestaService.verFiestas();
    }

    @GetMapping("/fiesta/{id}")
    @ResponseBody
    public Fiesta verFiesta(@RequestParam Long id){
        return fiestaService.verFiesta(id);
    }

    @DeleteMapping("/borrar/{di}")
    public void borrarFiesta(@RequestParam Long id){
        fiestaService.borrarFiesta(id);
    }

    @PostMapping("/fiesta/nueva")
    public void fiestaNueva(@RequestBody Fiesta fiesta){
        fiestaService.nuevaFiesta(fiesta);
    }
}
