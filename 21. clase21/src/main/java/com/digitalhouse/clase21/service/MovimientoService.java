package com.digitalhouse.clase21.service;

import com.digitalhouse.clase21.dto.CrearMovimientoDTO;
import com.digitalhouse.clase21.dto.MovimientoDTO;
import com.digitalhouse.clase21.entity.Movimiento;
import com.digitalhouse.clase21.repository.MovimientoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService implements MovimientoServiceInterface {

    private final MovimientoRepository movimientoRepository;

    @Autowired
    public MovimientoService(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    @Override
    public MovimientoDTO crearMovimiento(CrearMovimientoDTO crearMovimientoDTO) {
        Movimiento movimiento = new Movimiento();
        movimiento.setDescripcion(crearMovimientoDTO.descripcion());
        movimiento.setMonto(crearMovimientoDTO.monto());

        Movimiento save = movimientoRepository.save(movimiento);

        return new MovimientoDTO(save.getId(), save.getDescripcion(), save.getMonto());
    }

    @Override
    public List<MovimientoDTO> listarMovimientos() {
        ObjectMapper mapper = new ObjectMapper();

        List<Movimiento> movimientos = movimientoRepository.findAll();

        return mapper.convertValue(movimientos, new TypeReference<>() {
        });
    }
}
