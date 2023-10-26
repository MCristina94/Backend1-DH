package com.digital.Clase22Act.dto;

import java.util.List;

public record CrearEquipoDto(String nombre, String ciudad, List<CrearJugadorDto> jugadores)  {
}
