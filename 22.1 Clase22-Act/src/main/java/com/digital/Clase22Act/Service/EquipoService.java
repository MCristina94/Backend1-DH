package com.digital.Clase22Act.Service;

import com.digital.Clase22Act.Entity.Equipo;
import com.digital.Clase22Act.Repository.EquipoRepository;
import com.digital.Clase22Act.Repository.JugadorRepository;
import com.digital.Clase22Act.dto.CrearEquipoDto;
import com.digital.Clase22Act.dto.EquipoDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class EquipoService implements EquipoServiceInterface{

    private final EquipoRepository equipoRepository;
    private final JugadorRepository jugadorRepository;
    private final ObjectMapper mapper;


    @Override
    public EquipoDto crearEquipo(CrearEquipoDto crearEquipoDto) {
        Equipo equipo = mapper.convertValue(crearEquipoDto, Equipo.class);

        equipoRepository.save(equipo);

        equipo.getJugadores().forEach(jugador -> {
            jugador.setEquipo(equipo);
            jugadorRepository.save(jugador);
        });

        return mapper.convertValue(equipo, EquipoDto.class);
    }

    @Override
    public List<EquipoDto> listarEquipo() {
        List<Equipo> equipos = equipoRepository.findAll();
        return mapper.convertValue(equipos, new TypeReference<>() {
        });
    }

    @Override
    public String eliminarEquipo(Integer id) {
        return null;
    }
/*
    @Override
    public String eliminarEquipo(Integer id) {
        equipoRepository.deleteAllById(Collections.singleton(id));
        return "Eliminado";
    }*/
}
