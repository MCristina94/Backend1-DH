package com.digital.Clase22Act.dto;

import java.util.List;

public record EquipoDto(int id, String nombre, String ciudad, List<JugadorDto> jugadores) {
}
