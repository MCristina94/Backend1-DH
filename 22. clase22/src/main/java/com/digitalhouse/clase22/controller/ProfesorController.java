package com.digitalhouse.clase22.controller;

import com.digitalhouse.clase22.dto.ProfesorDTO;
import com.digitalhouse.clase22.dto.CrearProfesorDTO;
import com.digitalhouse.clase22.service.ProfesorServiceInterface;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profesores")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProfesorController {

    private final ProfesorServiceInterface profesorService;


    @PostMapping
    public ResponseEntity<ProfesorDTO> crearProfesor(@RequestBody CrearProfesorDTO request) {

        return ResponseEntity.ok().body(profesorService.crearProfesor(request));

    }

    @GetMapping
    public ResponseEntity<List<ProfesorDTO>> listarProfesors() {

        return ResponseEntity.ok().body(profesorService.listarProfesores());

    }

    @DeleteMapping
    public ResponseEntity<String> borrarProfesor(@RequestParam("id") String id){

        return ResponseEntity.ok().body(profesorService.eliminarProfesor(id));
    }


}
