package com.dh.Odontologia.Utils;

import com.dh.Odontologia.Entidades.Odontologo;
import com.dh.Odontologia.dto.ActualizarOdontologoDto;
import com.dh.Odontologia.dto.ActualizarPacienteDto;
import com.dh.Odontologia.dto.OdontologoDto;

public class Mapper {

    //map para odontologo

    public static Odontologo map(OdontologoDto dto){
        Odontologo odontologo = new Odontologo();

        odontologo.setApellido(dto.getApellido());
        odontologo.setNombre(dto.getNombre());
        odontologo.setId(dto.getId());
        odontologo.setMatricula(dto.getMatricula());
        return odontologo;

    }

    public static Odontologo map(ActualizarOdontologoDto dto){
        Odontologo odontologo = new Odontologo();

        odontologo.setApellido(dto.getApellido());
        odontologo.setNombre(dto.getNombre());
        odontologo.setId(dto.getId());
        odontologo.setMatricula(dto.getMatricula());
        return odontologo;

    }
}
