package com.dh.clinica.service;

import com.dh.clinica.model.Odontologo;
import com.dh.clinica.repository.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class OdontologoService {

    private final IDao<Odontologo> odontologoDao;

    @Autowired
    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }

    public Odontologo guardar(Odontologo odontologo) throws SQLException, ClassNotFoundException {
        return odontologoDao.guardar(odontologo);

    }

    public void eliminar(Integer id) throws SQLException, ClassNotFoundException {
        odontologoDao.eliminar(id);
    }

    public Odontologo buscar(Integer id) throws SQLException, ClassNotFoundException {
        return odontologoDao.buscar(id);
    }

    public List<Odontologo> buscarTodos() throws SQLException, ClassNotFoundException {
        return odontologoDao.buscarTodos();
    }

    public Odontologo actualizar(Odontologo odontologo) throws SQLException, ClassNotFoundException {
        return odontologoDao.actualizar(odontologo);
    }


}
