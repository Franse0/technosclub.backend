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
    private String precio;
    private String descripcion;
    private String organiza;

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
