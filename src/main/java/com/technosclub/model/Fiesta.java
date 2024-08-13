package com.technosclub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fiestas")
@Getter @Setter
public class Fiesta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombre;
    private String img;
    private String fecha;
    private String djs;
    private String ubicacion;
    @Column(length = 500)
    private String ubicacion_link;
    private String precio;
    @Column(length = 1500)
    private String descripcion;
    private String organiza;

    public Fiesta(Long id, String nombre, String img, String fecha, String djs,
                  String ubicacion, String ubicacion_link, String precio, String descripcion, String organiza) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.fecha = fecha;
        this.djs = djs;
        this.ubicacion = ubicacion;
        this.ubicacion_link = ubicacion_link;
        this.precio = precio;
        this.descripcion = descripcion;
        this.organiza = organiza;
    }

    public Fiesta(Long id, String nombre, String img, String fecha, String djs,
                  String ubicacion, String precio, String descripcion, String organiza) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.fecha = fecha;
        this.djs = djs;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.descripcion = descripcion;
        this.organiza = organiza;
    }

    public Fiesta() {
    }
}
