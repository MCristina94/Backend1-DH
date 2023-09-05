package com.digitalhouse.clase21.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TABLA_MOVIMIENTOS")
@Getter
@Setter
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "DESC")
    private String descripcion;

    private double monto;

}
