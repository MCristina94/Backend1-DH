package com.digitalhouse.clase21.service;

import com.digitalhouse.clase21.dto.CrearMovimientoDTO;
import com.digitalhouse.clase21.dto.MovimientoDTO;

import java.util.List;

public interface MovimientoServiceInterface {
    MovimientoDTO crearMovimiento (CrearMovimientoDTO crearMovimientoDTO);

    List<MovimientoDTO> listarMovimientos ();
}
