package com.dh.clinica.controller;

import com.dh.clinica.dto.TurnoDto;
import com.dh.clinica.model.Turno;
import com.dh.clinica.service.TurnoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Turno> crearTurno(@RequestBody TurnoDto request) {
        LOG.info("Me llego:  " + request);
        Turno turno;
        try {
            turno = turnoService.guardar(request);
        } catch (Exception e) {
            LOG.error("no se pudo guardar el turno");
            return ResponseEntity.badRequest().build();
        }
        LOG.info("se pudo guardar el turno");

        return new ResponseEntity<>(turno, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Turno>> listarTurnos() {
        LOG.info("Me llego: listar turnos  " );

        return new ResponseEntity<>(turnoService.buscarTodos(), HttpStatus.OK);
    }

}
