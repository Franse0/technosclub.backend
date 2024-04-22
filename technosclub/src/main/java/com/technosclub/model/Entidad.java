package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "entidades")
@Getter @Setter
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private String img;
    // Cambiado de List<String> a String

    private String img_list;
    private String instagram;
    private String facebook;
    private String tiktok;
    private String mail;
    private String youtube;
    @Column
    private String video_yt;
    @Column (length = 2500)
    private String descripcion;

    public Entidad(int id, String nombre, String img, String img_list, String instagram, String facebook,
                   String tiktok, String mail, String youtube, String video_yt, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.img_list = img_list;
        this.instagram = instagram;
        this.facebook = facebook;
        this.tiktok = tiktok;
        this.mail = mail;
        this.youtube = youtube;
        this.video_yt = video_yt;
        this.descripcion = descripcion;
    }

    public Entidad() {
    }

    public void setImgs(List<String> imgs) {
        // Puedes usar String.join para convertir la lista a una cadena con comas entre elementos.
        this.img_list = String.join(", ", imgs);
    }
}
