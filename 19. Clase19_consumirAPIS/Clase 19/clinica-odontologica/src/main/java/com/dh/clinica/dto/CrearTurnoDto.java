package com.dh.clinica.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude
public class CrearTurnoDto {

    private int pacienteId;

    @JsonAlias({"dentista","dentistaId"})
    private int odontologoId;

    private Date fecha;

    public CrearTurnoDto(int pacienteId, int odontologoId, Date fecha) {
        this.pacienteId = pacienteId;
        this.odontologoId = odontologoId;
        this.fecha = fecha;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public int getOdontologoId() {
        return odontologoId;
    }

    public void setOdontologoId(int odontologoId) {
        this.odontologoId = odontologoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
