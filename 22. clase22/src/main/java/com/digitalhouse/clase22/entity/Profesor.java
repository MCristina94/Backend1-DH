package com.digitalhouse.clase22.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.List;


@Getter
@Setter
@Entity
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nombre;

    private String titulo;

    @OneToMany(mappedBy = "profesor",cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    private List<Alumno> alumnos;


}
