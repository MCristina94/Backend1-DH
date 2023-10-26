package com.digital.Odontologia.Controller;

import com.digital.Odontologia.Dto.*;
import com.digital.Odontologia.Service.OdontologoServiceInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/odontologos")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OdontologoController {

    private final OdontologoServiceInterface odontologoService;
    private final Logger LOGGER = Logger.getLogger(OdontologoController.class);


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OdontologoDto> crearOdontologo(@RequestBody CrearOdontologoDto request) throws Exception {
        LOGGER.info("Me llego: " +request);
        return ResponseEntity.ok().body(odontologoService.crear(request));
    }
    @GetMapping
    public ResponseEntity<List<OdontologoDto>> listarOdontologo() throws Exception {
        return ResponseEntity.ok().body(odontologoService.listar());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarOdontologo(@PathVariable Long id) throws Exception {
        LOGGER.info("Me llego: " + id);
        return ResponseEntity.ok().body(odontologoService.eliminar(id));
    }

    @PutMapping
    public void modificarOdontologo(@RequestBody ActualizarOdontologoDto request) throws Exception {
        LOGGER.info("Me llego: " +request);
        odontologoService.modificar(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OdontologoDto> buscarOdontologo(@PathVariable Long id) throws Exception {
        LOGGER.info("Me llego: " + id);
        return ResponseEntity.ok().body(odontologoService.buscar(id));
    }

}
