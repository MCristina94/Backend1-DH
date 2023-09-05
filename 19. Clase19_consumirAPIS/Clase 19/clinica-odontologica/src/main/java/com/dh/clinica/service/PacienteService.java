package com.dh.clinica.service;


import com.dh.clinica.repository.IDao;
import com.dh.clinica.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private IDao<Paciente> pacienteIDao;

    @Autowired
    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardar(Paciente p) throws SQLException, ClassNotFoundException {
        p.setFechaIngreso(new Date());
        return pacienteIDao.guardar(p);
    }

    public Paciente buscar(Integer id) throws SQLException, ClassNotFoundException {
        return pacienteIDao.buscar(id);
    }

    public List<Paciente> buscarTodos() throws SQLException, ClassNotFoundException {
        return pacienteIDao.buscarTodos();
    }

    public void eliminar(Integer id) throws SQLException, ClassNotFoundException {
        pacienteIDao.eliminar(id);
    }

    public Paciente actualizar(Paciente p) throws SQLException, ClassNotFoundException {
        return pacienteIDao.actualizar(p);
    }
}
