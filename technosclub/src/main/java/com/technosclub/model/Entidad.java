package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private String instagram;
    private String facebook;
    private String tiktok;
    private String mail;
    private String telefono;
    private String youtube;
    @Column
    private String video_yt;
    @Column (length = 2500)
    private String descripcion;
}
