package com.digital.Clase21Act.Service;

import com.digital.Clase21Act.dto.CrearUsuarioDto;
import com.digital.Clase21Act.dto.UsuarioDto;

import java.util.List;

public interface UsuarioServiceInterface {

    UsuarioDto crearUsuario (CrearUsuarioDto crearMovimientoDto);
    List<UsuarioDto> listarUsuarios();
}
