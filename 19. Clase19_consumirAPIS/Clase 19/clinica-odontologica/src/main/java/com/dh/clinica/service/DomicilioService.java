package com.dh.clinica.service;


import com.dh.clinica.model.Domicilio;
import com.dh.clinica.repository.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class DomicilioService {
    private final IDao<Domicilio> domicilioDao;

    @Autowired
    public DomicilioService(IDao<Domicilio> domicilioDao) {
        this.domicilioDao = domicilioDao;
    }

    public Domicilio guardar(Domicilio d) throws SQLException, ClassNotFoundException {
        domicilioDao.guardar(d);
        return d;
    }

    public Domicilio buscar(Integer id) throws SQLException, ClassNotFoundException {
        return domicilioDao.buscar(id);
    }

    public List<Domicilio> buscarTodos() throws SQLException, ClassNotFoundException {
        return domicilioDao.buscarTodos();
    }

    public void eliminar(Integer id) throws SQLException, ClassNotFoundException {
        domicilioDao.eliminar(id);
    }

}
