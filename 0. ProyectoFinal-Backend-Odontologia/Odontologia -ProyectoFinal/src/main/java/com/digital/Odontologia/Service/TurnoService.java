package com.digital.Odontologia.Service;

import com.digital.Odontologia.Dto.ActualizarTurnoDto;
import com.digital.Odontologia.Dto.CrearTurnoDto;
import com.digital.Odontologia.Dto.OdontologoDto;
import com.digital.Odontologia.Dto.TurnoDto;
import com.digital.Odontologia.Entity.Odontologo;
import com.digital.Odontologia.Entity.Paciente;
import com.digital.Odontologia.Entity.Turno;
import com.digital.Odontologia.Repository.TurnoRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TurnoService implements TurnoServiceInterface{

    private final TurnoRepository turnoRepository;
    private final ObjectMapper mapper;
    private static final Logger LOGGER = Logger.getLogger(TurnoService.class);

    @Override
    public TurnoDto crear(CrearTurnoDto crearTurnoDto)throws Exception {
        Turno turno = null;
        try {
            turno = mapper.convertValue(crearTurnoDto, Turno.class);
            turnoRepository.save(turno);
            LOGGER.info("Se creo el turno");
        } catch (Exception e) {
            LOGGER.error("No fue posible crear el turno" + e);
        }
        return mapper.convertValue(turno, TurnoDto.class);
    }

    @Override
    public List<TurnoDto> listar() throws Exception {
        List<Turno> turnos = null;
        try {
            turnos = turnoRepository.findAll();
        } catch (Exception e) {
            LOGGER.error("No fue posible listar los turnos", e);
        }
            return mapper.convertValue(turnos, new TypeReference<>() {
            });
        }

        @Override
        public TurnoDto modificar (ActualizarTurnoDto actualizarTurnoDto)throws Exception {
            Turno turno = null;
            try {
                turno = mapper.convertValue(actualizarTurnoDto, Turno.class);
                turnoRepository.save(turno);
                LOGGER.info("Se moficaron los datos del turno");
            } catch (Exception e) {
                LOGGER.error("Se presentó error al modificar los datos del turno ", e);
            }
            return mapper.convertValue(turno, TurnoDto.class);
        }

        @Override
        public String eliminar (Long id) throws Exception {
            try{
            turnoRepository.deleteById(id);
                LOGGER.info("Se eliminó el turno");
            }catch (Exception e){
                LOGGER.error("Se presentó error al eliminar el turno", e);
            }
            return "Eliminado";
        }

        @Override
        public TurnoDto buscar (Long id) throws Exception {
            TurnoDto turnoDto = null;
            try {
                Optional<Turno> turno = turnoRepository.findById(id);
                turnoDto = null;
                if (turno.isPresent())
                    turnoDto = mapper.convertValue(turno, TurnoDto.class);
            } catch (Exception e) {
                LOGGER.error("No fue posible encontrar el turno");
            }
            return turnoDto;
        }
    }
