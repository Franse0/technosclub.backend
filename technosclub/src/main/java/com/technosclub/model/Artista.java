package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "artistas")
@Getter @Setter
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private String seudonimo;
    private String img;
    private String url;
    private String soundcloud;
    private String spotify;
    private String instagram;
    private String descripcion;

    public Artista() {
    }

    public Artista(Long id, String nombre, String apellido, String seudonimo, String img,
                   String url, String soundcloud, String spotify, String instagram, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.seudonimo = seudonimo;
        this.img = img;
        this.url = url;
        this.soundcloud = soundcloud;
        this.spotify = spotify;
        this.instagram = instagram;
        this.descripcion = descripcion;
    }
}
