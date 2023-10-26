package com.digitalhouse.clase22.dto;

import java.util.List;

public record CrearProfesorDTO(String nombre, String titulo, List<CrearAlumnoDTO> alumnos) {
}
