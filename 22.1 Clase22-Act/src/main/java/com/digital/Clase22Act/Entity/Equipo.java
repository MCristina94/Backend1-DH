package com.digital.Clase22Act.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private String ciudad;

    @OneToMany(mappedBy = "Equipo", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Jugador> jugadores;
}
