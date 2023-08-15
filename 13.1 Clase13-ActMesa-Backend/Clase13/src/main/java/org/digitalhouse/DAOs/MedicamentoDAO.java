package org.digitalhouse.DAOs;

import org.digitalhouse.Entidades.Medicamento;

import java.util.List;

public interface MedicamentoDAO {
    public abstract void guardar (Medicamento medicamento) throws Exception;

    public abstract Medicamento buscar (int id) throws Exception;
    public abstract List<Medicamento> buscarPorPrecio (Double precio);
}
