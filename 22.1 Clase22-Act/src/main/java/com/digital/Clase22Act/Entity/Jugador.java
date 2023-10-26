package com.digital.Clase22Act.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String puesto;
    private int numero;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Equipo_Id")
    @JsonIgnore
    private Equipo equipo;


}
