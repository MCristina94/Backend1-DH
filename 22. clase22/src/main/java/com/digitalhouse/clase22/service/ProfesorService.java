package com.digitalhouse.clase22.service;

import com.digitalhouse.clase22.dto.CrearProfesorDTO;
import com.digitalhouse.clase22.dto.ProfesorDTO;
import com.digitalhouse.clase22.entity.Profesor;
import com.digitalhouse.clase22.repository.AlumnoRepository;
import com.digitalhouse.clase22.repository.ProfesorRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProfesorService implements ProfesorServiceInterface {

    private final ProfesorRepository profesorRepository;
    private final AlumnoRepository alumnoRepository;

    private final ObjectMapper mapper;


    @Override
    public ProfesorDTO crearProfesor(CrearProfesorDTO crearProfesorDTO) {
        Profesor profesor = mapper.convertValue(crearProfesorDTO, Profesor.class);

        profesorRepository.save(profesor);

        profesor.getAlumnos().forEach(alumno -> {
            alumno.setProfesor(profesor);
            alumnoRepository.save(alumno);
        });


        return mapper.convertValue(profesor, ProfesorDTO.class);
    }

    @Override
    public List<ProfesorDTO> listarProfesores() {

        List<Profesor> profesores = profesorRepository.findAll();

        return mapper.convertValue(profesores, new TypeReference<>() {
        });
    }

    @Override
    public String eliminarProfesor(String id) {
        profesorRepository.deleteById(id);
        return "Okey";
    }

}
