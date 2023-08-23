package com.dh.clinica.controller;

import com.dh.clinica.dto.ActualizarPacienteDto;
import com.dh.clinica.dto.PacienteDto;
import com.dh.clinica.service.PacienteService;
import com.dh.clinica.util.Mapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final Logger LOGGER = Logger.getLogger(PacienteController.class);
    private final PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping
    public void crearPaciente(@RequestBody PacienteDto request) {
        LOGGER.info("Me llego:  " + request);
        pacienteService.guardar(Mapper.map(request));
    }

    @PutMapping
    public void actualizarPaciente(@RequestBody ActualizarPacienteDto request) {
        LOGGER.info("Me llego:  " + request);
        pacienteService.actualizar(Mapper.map(request));
    }


}
