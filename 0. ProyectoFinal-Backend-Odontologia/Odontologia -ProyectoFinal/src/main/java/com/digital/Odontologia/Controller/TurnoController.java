package com.digital.Odontologia.Controller;

import com.digital.Odontologia.Dto.*;
import com.digital.Odontologia.Service.TurnoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turnos")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TurnoController {

    private final TurnoServiceInterface turnoService;
    private final Logger LOGGER = Logger.getLogger(TurnoController.class);

    @PostMapping
    public ResponseEntity<TurnoDto> crearTurno(@RequestBody CrearTurnoDto request) throws Exception {
        LOGGER.info("Me llego: " +request);
        return ResponseEntity.ok().body(turnoService.crear(request));

    }
    @GetMapping
    public ResponseEntity<List<TurnoDto>> listarTurnos() throws Exception {
        return ResponseEntity.ok().body(turnoService.listar());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTurno(@PathVariable Long id) throws Exception {
        LOGGER.info("Me llego: " + id);
        return ResponseEntity.ok().body(turnoService.eliminar(id));
    }

    @PutMapping
    public void modificarTurno(@RequestBody ActualizarTurnoDto request) throws Exception {
        LOGGER.info("Me llego: " +request);
        turnoService.modificar(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TurnoDto> buscarTurno(@PathVariable Long id) throws Exception {
        LOGGER.info("Me llego: " + id);
        return ResponseEntity.ok().body(turnoService.buscar(id));
    }


}
