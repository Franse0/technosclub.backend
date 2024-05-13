package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "registros")
@Getter
@Setter
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String email;
    private String categoria;
    public Registro() {
    }

    public Registro(Long id, String email, String categoria) {
        this.id = id;
        this.email = email;
        this.categoria = categoria;
    }
}
