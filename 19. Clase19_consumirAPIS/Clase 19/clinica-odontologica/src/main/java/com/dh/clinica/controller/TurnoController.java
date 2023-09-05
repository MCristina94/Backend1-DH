package com.dh.clinica.controller;

import com.dh.clinica.dto.CrearTurnoDto;
import com.dh.clinica.dto.TurnoDto;
import com.dh.clinica.model.Turno;
import com.dh.clinica.service.TurnoService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private final TurnoService turnoService;
    private final Logger LOG = Logger.getLogger(TurnoController.class);

    @Autowired
    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @PostMapping
    public ResponseEntity<TurnoDto> crearTurno(@RequestBody CrearTurnoDto request) {
        LOG.info("Me llego:  " + request);
        ObjectMapper mapper = new ObjectMapper();
        Turno turno;
        try {
            turno = turnoService.guardar(request);
        } catch (Exception e) {
            LOG.error("no se pudo guardar el turno");
            return ResponseEntity.badRequest().build();
        }
        LOG.info("se pudo guardar el turno");

        return new ResponseEntity<>(mapper.convertValue(turno, TurnoDto.class), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TurnoDto>> listarTurnos() {
        LOG.info("Me llego: listar turnos  ");
        ObjectMapper mapper = new ObjectMapper();
        List<TurnoDto> response = null;
        try {
            response = mapper.convertValue(turnoService.buscarTodos(), new TypeReference<>() {});
        } catch (SQLException | ClassNotFoundException e) {
            LOG.error("Ocurrio un error al listar los turnos", e);
            return ResponseEntity.badRequest().build();

        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
