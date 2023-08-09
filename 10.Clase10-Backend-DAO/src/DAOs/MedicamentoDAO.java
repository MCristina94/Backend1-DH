package DAOs;

import Entidades.Medicamento;

import java.sql.SQLException;

public interface MedicamentoDAO {
    public abstract void guardar (Medicamento medicamento) throws Exception;

    public abstract Medicamento buscar (int id) throws Exception;
    public abstract void traerMedicamentos() throws Exception;
}
