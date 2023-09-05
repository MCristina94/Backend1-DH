package com.dh.clinica.controller;

import com.dh.clinica.dto.CrearPacienteDto;
import com.dh.clinica.dto.PacienteDto;
import com.dh.clinica.service.PacienteService;
import com.dh.clinica.util.Mapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

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
    public void crearPaciente(@RequestBody CrearPacienteDto request) {
        LOGGER.info("Me llego:  " + request);
        try {
            pacienteService.guardar(Mapper.map(request));
        } catch (SQLException | ClassNotFoundException e) {
            LOGGER.error("Ocurrio un error al persistir el paciente", e);

        }
    }

    @PutMapping
    public void actualizarPaciente(@RequestBody PacienteDto request) {
        LOGGER.info("Me llego:  " + request);
        try {
            pacienteService.actualizar(Mapper.map(request));
        } catch (SQLException | ClassNotFoundException e) {
            LOGGER.error("Ocurrio un error al actualizar el paciente", e);

        }
    }


}
