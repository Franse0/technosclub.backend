package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "noticias")
@Getter @Setter
public class Noticias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String titulo;
    @Column(length = 2500)
    private String cuerpo;
    @Column(length = 1500)
    private String resumen;
    private String fecha_publi;
    private String img;
    private String url;
    public Noticias() {
    }

    public Noticias(Long id, String titulo, String cuerpo, String resumen, String fecha_publi, String img, String url) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.resumen = resumen;
        this.fecha_publi = fecha_publi;
        this.img = img;
        this.url = url;
    }
}