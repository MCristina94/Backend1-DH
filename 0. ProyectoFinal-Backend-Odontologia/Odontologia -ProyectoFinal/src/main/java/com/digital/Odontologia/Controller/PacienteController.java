package com.digital.Odontologia.Controller;

import com.digital.Odontologia.Dto.ActualizarPacienteDto;
import com.digital.Odontologia.Dto.CrearPacienteDto;
import com.digital.Odontologia.Dto.PacienteDto;
import com.digital.Odontologia.Service.PacienteServiceInterface;
import lombok.RequiredArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class PacienteController {
    private final PacienteServiceInterface pacienteService;
    private final Logger LOGGER = Logger.getLogger(PacienteController.class);

    @PostMapping
    public ResponseEntity<PacienteDto> crearPaciente(@RequestBody CrearPacienteDto request) throws Exception {
        LOGGER.info("Me llego: " +request);
        return ResponseEntity.ok().body(pacienteService.crear(request));

    }
    @GetMapping
    public ResponseEntity<List<PacienteDto>> listarPacientes() throws Exception {
        return ResponseEntity.ok().body(pacienteService.listar());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable Long id) throws Exception {
        LOGGER.info("Me llego: " + id);
        return ResponseEntity.ok().body(pacienteService.eliminar(id));
    }

    @PutMapping
    public void modificarPaciente(@RequestBody CrearPacienteDto request) throws Exception {
        LOGGER.info("Me llego: " +request);
        pacienteService.modificar(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDto> buscarPaciente(@PathVariable Long id) throws Exception {
        LOGGER.info("Me llego: " + id);
        return ResponseEntity.ok().body(pacienteService.buscar(id));
    }


}
