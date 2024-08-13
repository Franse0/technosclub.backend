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
    @Column(length = 2500)
    private String descripcion;
    private String img1;
    private String img2;
    private String img_list;
    private String video;
    private String instagram;
    private String ubicacion;

    private String facebook;
    private String telefono;
    private String horario;
    @Column(length = 500)
    private String link_ubi;


    public Lugares(Long id, String nombre, String descripcion, String img1, String img2,
                   String img_list, String video, String instagram,
                   String ubicacion, String facebook, String telefono, String horario, String link_ubi) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img1 = img1;
        this.img2 = img2;
        this.img_list = img_list;
        this.video = video;
        this.instagram = instagram;
        this.ubicacion = ubicacion;
        this.facebook = facebook;
        this.telefono = telefono;
        this.horario = horario;
        this.link_ubi = link_ubi;
    }

    public Lugares() {
    }
}
