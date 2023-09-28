package com.technosclub.controller;

import com.technosclub.model.Fiesta;
import com.technosclub.service.FiestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")

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
    public Optional<Fiesta> verFiesta(@PathVariable Long id){
        return fiestaService.verFiesta(id);
    }

    @DeleteMapping("/fiesta/borrar/{id}")
    public void borrarFiesta(@PathVariable long id){
        fiestaService.borrarFiesta(id);
    }

    @PostMapping("/fiesta")
    public void fiestaNueva(@RequestBody Fiesta fiesta){
        fiestaService.nuevaFiesta(fiesta);
    }
}
