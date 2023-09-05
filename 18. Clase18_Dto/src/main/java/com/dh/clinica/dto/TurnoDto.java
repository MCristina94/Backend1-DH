package com.dh.clinica.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude
public class TurnoDto {

    private int pacienteId;
    @JsonProperty
    private int odontologoId;
    @JsonAlias({"date"})
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    //2016-12-18@07:53
    private Date fecha;

    public TurnoDto(int pacienteId, int odontologoId, Date fecha) {
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
