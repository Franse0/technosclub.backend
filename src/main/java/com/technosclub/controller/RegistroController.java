package com.technosclub.controller;

import com.technosclub.model.Noticias;
import com.technosclub.model.Registro;
import com.technosclub.service.NoticiasService;
import com.technosclub.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")


public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @GetMapping("/registros")
    @ResponseBody
    public List<Registro> verRegistros(){
        return registroService.traerRegistros();
    }

    @GetMapping("/registro/{id}")
    @ResponseBody
    public Optional<Registro> verRegistro(@PathVariable Long id){
        return  registroService.traerRegistro(id);
    }

    @DeleteMapping("/registro/borrar/{id}")
    public void borrarRegistro(@PathVariable Long id){
        registroService.borrarRegistro(id);
    }


    @PostMapping("/registro")
    public void crearNoticia(@RequestBody Registro registro){
        registroService.nuevoRegistro(registro);
    }

}
