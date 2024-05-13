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
    private String tiktok;
    private String spotify;
    private String youtube;
    private String ubicacion;
    private String video;
    private String mail;
    @Column (length = 2500)
    private String descripcion;
    @Column(length = 1500)
    private String track;

    public Artista() {
    }

    public Artista(Long id, String nombre, String apellido, String pretskit, String seudonimo, String img,
                   String img_list, String soundcloud, String instagram, String tiktok, String spotify,
                   String youtube, String ubicacion, String video, String mail, String descripcion, String track) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pretskit = pretskit;
        this.seudonimo = seudonimo;
        this.img = img;
        this.img_list = img_list;
        this.soundcloud = soundcloud;
        this.instagram = instagram;
        this.tiktok = tiktok;
        this.spotify = spotify;
        this.youtube = youtube;
        this.ubicacion = ubicacion;
        this.video = video;
        this.mail = mail;
        this.descripcion = descripcion;
        this.track = track;
    }

    public void setImgs(List<String> imgs) {
        // Puedes usar String.join para convertir la lista a una cadena con comas entre elementos.
        this.img_list = String.join(", ", imgs);
    }
}
