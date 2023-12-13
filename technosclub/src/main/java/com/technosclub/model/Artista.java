package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
    private String pretskit;
    private String seudonimo;
    private String img;
    private String img_list;
    private String soundcloud;
    private String instagram;
    private String spotify;
    private String youtube;
    private String mail;
    private String telefono;
    @Column (length = 2500)
    private String descripcion;

    public Artista() {
    }

    public Artista(Long id, String nombre, String apellido, String pretskit, String seudonimo,
                   String img, String img_list, String soundcloud,
                   String instagram, String spotify, String youtube, String mail, String telefono, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pretskit = pretskit;
        this.seudonimo = seudonimo;
        this.img = img;
        this.img_list = img_list;
        this.soundcloud = soundcloud;
        this.instagram = instagram;
        this.spotify = spotify;
        this.youtube = youtube;
        this.mail = mail;
        this.telefono = telefono;
        this.descripcion = descripcion;
    }
    public void setImgs(List<String> imgs) {
        // Puedes usar String.join para convertir la lista a una cadena con comas entre elementos.
        this.img_list = String.join(", ", imgs);
    }
}
