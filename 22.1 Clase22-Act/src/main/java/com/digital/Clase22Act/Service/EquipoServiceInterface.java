package com.digital.Clase22Act.Service;

import com.digital.Clase22Act.dto.CrearEquipoDto;
import com.digital.Clase22Act.dto.EquipoDto;

import java.util.List;

public interface EquipoServiceInterface {

    EquipoDto crearEquipo (CrearEquipoDto crearEquipoDto);
    List<EquipoDto> listarEquipo();
    String eliminarEquipo(Integer id);

}
