package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fieestas")
@Getter @Setter
public class Fiesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String ubicacion;
    private String djs;
    private String organiza;

    public Fiesta(Long id, String nombre, String ubicacion, String djs, String organiza) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.djs = djs;
        this.organiza = organiza;
    }

    public Fiesta() {
    }
}
