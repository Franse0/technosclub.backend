package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "locaciones")
@Getter @Setter
public class Lugares {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String descripcion;
    private String img1;
    private String img2;
    private String instagram;
    private String ubicacion;
    private String link_ubi;


    public Lugares(Long id, String nombre, String descripcion, String img1,
                   String img2, String instagram, String ubicacion, String link_ubi) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img1 = img1;
        this.img2 = img2;
        this.instagram = instagram;
        this.ubicacion = ubicacion;
        this.link_ubi = link_ubi;
    }

    public Lugares() {
    }
}
