package com.dh.clinica.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class TurnoDto {
    @JsonProperty(index = 1)
    private int id;
    private PacienteDto paciente;
    private OdontologoDto odontologo;
    @JsonFormat( pattern = "yyyy-MM-dd HH:mm")
    @JsonProperty(index = 2)
    private Date fecha;

}
