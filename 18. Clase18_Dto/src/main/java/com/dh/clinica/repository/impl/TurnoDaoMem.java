package com.dh.clinica.repository.impl;

import com.dh.clinica.model.Turno;
import com.dh.clinica.repository.IDao;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Repository
public class TurnoDaoMem implements IDao<Turno> {
    private HashMap<Integer, Turno> turnos = new HashMap<>();


    @Override
    public Turno guardar(Turno turno) {
        turno.setId(turnos.size() + 1);
        turnos.put(turno.getId(), turno);
        return turno;
    }

    @Override
    public Turno buscar(Integer id) {
        return turnos.get(id);
    }

    @Override
    public void eliminar(Integer id) {
        turnos.replace(id,null);
    }

    @Override
    public List<Turno> buscarTodos() {
       return turnos.values().stream().toList();
    }

    @Override
    public Turno actualizar(Turno turno) {
        turnos.replace(turno.getId(),turno);
        return turno;
    }
}
