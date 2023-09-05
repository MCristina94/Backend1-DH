package com.dh.clinica.service;

import com.dh.clinica.dto.TurnoDto;
import com.dh.clinica.model.Odontologo;
import com.dh.clinica.model.Paciente;
import com.dh.clinica.model.Turno;
import com.dh.clinica.repository.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoService {
    private final IDao<Turno> turnosDao;
    private final IDao<Paciente> pacienteIDao;
    private final IDao<Odontologo> odontologoIDao;

    @Autowired
    public TurnoService(IDao<Turno> turnosDao, IDao<Paciente> pacienteIDao, IDao<Odontologo> odontologoIDao) {
        this.turnosDao = turnosDao;
        this.pacienteIDao = pacienteIDao;
        this.odontologoIDao = odontologoIDao;
    }

    public void eliminar(Integer id) {
        turnosDao.eliminar(id);
    }

    public Turno buscar(Integer id) {
        return turnosDao.buscar(id);
    }

    public Turno guardar(TurnoDto turnoDto) throws Exception {
        Turno turno = new Turno();
        Paciente paciente = pacienteIDao.buscar(turnoDto.getPacienteId());
        Odontologo odontologo = odontologoIDao.buscar(turnoDto.getOdontologoId());

        if (paciente == null) throw new Exception("No se encontro el paciente");
        if (odontologo == null) throw new Exception("No se encontro el odontologo");

        turno.setOdontologo(odontologo);
        turno.setPaciente(paciente);
        turno.setFecha(turnoDto.getFecha());

        return turnosDao.guardar(turno);
    }

    public List<Turno> buscarTodos() {
        return turnosDao.buscarTodos();
    }

    public Turno actualizar(Turno Turno) {
        return turnosDao.actualizar(Turno);
    }
}
