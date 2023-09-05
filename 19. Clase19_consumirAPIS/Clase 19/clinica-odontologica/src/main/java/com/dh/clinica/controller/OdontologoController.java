package com.dh.clinica.controller;

import com.dh.clinica.dto.CrearOdontologoDto;
import com.dh.clinica.dto.OdontologoDto;
import com.dh.clinica.model.Odontologo;
import com.dh.clinica.service.OdontologoService;
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
@RequestMapping("/odontologos")
public class OdontologoController {

    private final Logger LOGGER = Logger.getLogger(OdontologoController.class);
    private final OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @PostMapping
    public void crearOdontologo(@RequestBody CrearOdontologoDto request) {
        LOGGER.info("Me llego:  " + request);
        ObjectMapper mapper = new ObjectMapper();

        try {
            odontologoService.guardar(mapper.convertValue(request, Odontologo.class));
        } catch (SQLException | ClassNotFoundException e) {
            LOGGER.error("Ocurrio un error al persistir el odontologo", e);
        }
    }

    @PutMapping
    public void actualizarOdontologo(@RequestBody OdontologoDto request) {
        LOGGER.info("Me llego:  " + request);
        ObjectMapper mapper = new ObjectMapper();

        try {
            odontologoService.actualizar(mapper.convertValue(request, Odontologo.class));
        } catch (SQLException | ClassNotFoundException e) {
            LOGGER.error("Ocurrio un error al actualizar el odontologo", e);
        }
    }

    @GetMapping
    public ResponseEntity<List<OdontologoDto>> listarOdontologos() {
        LOGGER.info("Me llego: listar odontologos  ");
        ObjectMapper mapper = new ObjectMapper();
        List<OdontologoDto> response = null;
        try {
            response = mapper.convertValue(odontologoService.buscarTodos(), new TypeReference<>() {
            });
        } catch (SQLException | ClassNotFoundException e) {
            LOGGER.error("Ocurrio un error al persistir el odontologo", e);
            return ResponseEntity.badRequest().build();
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
