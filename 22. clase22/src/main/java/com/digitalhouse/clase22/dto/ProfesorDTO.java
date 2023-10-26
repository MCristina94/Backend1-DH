package com.digitalhouse.clase22.dto;

import com.digitalhouse.clase22.entity.Alumno;

import java.util.List;

public record ProfesorDTO(String id, String nombre, String titulo, List<AlumnoDTO> alumnos) {
}
