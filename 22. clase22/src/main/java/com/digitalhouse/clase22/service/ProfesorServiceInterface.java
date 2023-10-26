package com.digitalhouse.clase22.service;

import com.digitalhouse.clase22.dto.ProfesorDTO;
import com.digitalhouse.clase22.dto.CrearProfesorDTO;

import java.util.List;

public interface ProfesorServiceInterface {
    ProfesorDTO crearProfesor (CrearProfesorDTO crearProfesorDTO);

    List<ProfesorDTO> listarProfesores ();

    String eliminarProfesor(String id);
}
