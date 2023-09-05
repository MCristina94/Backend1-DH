package com.dh.clinica.dto;

/*
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
 */
public record PacienteDto(String nombre,
                          String apellido,
                          String dni,
                          DomicilioDto domicilio) {

    public PacienteDto(String nombre, String apellido, String dni) {
        this(nombre,apellido,dni,null);
    }
}
