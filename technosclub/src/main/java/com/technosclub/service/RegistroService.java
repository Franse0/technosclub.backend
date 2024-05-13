package com.technosclub.service;

import com.technosclub.model.Registro;
import com.technosclub.respository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroService  implements  IRegistroService{

    @Autowired
    private RegistroRepository registroRepository;
    @Override
    public void nuevoRegistro(Registro registro) {
        registroRepository.save(registro);
    }

    @Override
    public void borrarRegistro(Long id) {
        registroRepository.deleteById(id);
    }

    @Override
    public List<Registro> traerRegistros() {
        return registroRepository.findAll();
    }

    @Override
    public Optional<Registro> traerRegistro(Long id) {
        return registroRepository.findById(id);
    }
}
