package com.digitalhouse.clase21.controller;

import com.digitalhouse.clase21.dto.CrearMovimientoDTO;
import com.digitalhouse.clase21.dto.MovimientoDTO;
import com.digitalhouse.clase21.service.MovimientoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimientos")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class MovimientoController {

    private final MovimientoServiceInterface movimientoService;


    @PostMapping
    public ResponseEntity<MovimientoDTO> crearMovimiento(@RequestBody CrearMovimientoDTO request) {

        return ResponseEntity.ok().body(movimientoService.crearMovimiento(request));

    }

    @GetMapping
    public ResponseEntity<List<MovimientoDTO>> listarMovimientos() {

        return ResponseEntity.ok().body(movimientoService.listarMovimientos());

    }


}
