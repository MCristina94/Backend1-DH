package com.dh.clinica.util;

import com.dh.clinica.dto.ActualizarPacienteDto;
import com.dh.clinica.dto.PacienteDto;
import com.dh.clinica.dto.TurnoDto;
import com.dh.clinica.model.Domicilio;
import com.dh.clinica.model.Paciente;
import com.dh.clinica.model.Turno;

public class Mapper {

    public static Paciente map(PacienteDto dto) {
        Paciente paciente = new Paciente();
        Domicilio domicilio = new Domicilio();

        paciente.setApellido(dto.apellido());
        paciente.setDni(dto.dni());
        paciente.setNombre(dto.nombre());
        paciente.setDomicilio(domicilio);

        domicilio.setCalle(dto.domicilio().getCalle());
        domicilio.setLocalidad(dto.domicilio().getLocalidad());
        domicilio.setNumero(dto.domicilio().getNumero());
        domicilio.setProvincia(dto.domicilio().getProvincia());

        return paciente;
    }

    public static Paciente map(ActualizarPacienteDto dto) {
        Paciente paciente = new Paciente();
        Domicilio domicilio = new Domicilio();

        paciente.setId(dto.getId());
        paciente.setFechaIngreso(dto.getFechaIngreso());
        paciente.setApellido(dto.getApellido());
        paciente.setDni(dto.getDni());
        paciente.setNombre(dto.getNombre());
        paciente.setDomicilio(domicilio);

        domicilio.setId(dto.getDomicilio().getId());
        domicilio.setCalle(dto.getDomicilio().getCalle());
        domicilio.setLocalidad(dto.getDomicilio().getLocalidad());
        domicilio.setNumero(dto.getDomicilio().getNumero());
        domicilio.setProvincia(dto.getDomicilio().getProvincia());

        return paciente;

    }

}
