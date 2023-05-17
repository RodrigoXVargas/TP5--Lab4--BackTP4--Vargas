package com.example.instrumentosback.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "instrumentos")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Instrumento extends Base {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "instrumento")
    private String instrumento;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "precio")
    private String precio;

    @Column(name = "costoEnvio")
    private String costo_envio;

    @Column(name = "cantidadVendida")
    private String cantidad_vendida;

    @Column(name = "descripcion")
    private String descripcion;


}
