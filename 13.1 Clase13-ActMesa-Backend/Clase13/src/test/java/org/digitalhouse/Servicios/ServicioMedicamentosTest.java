package org.digitalhouse.Servicios;

import junit.framework.TestCase;
import org.digitalhouse.DAOs.Impl.MedicamentoDAOImpl;
import org.digitalhouse.DAOs.MedicamentoDAO;
import org.digitalhouse.Entidades.Medicamento;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

public class ServicioMedicamentosTest extends TestCase {
    Medicamento med;
    ServicioMedicamentos servicioMedicamentos;
    MedicamentoDAO medicamentoDAO;

    @Before
    public void before(){
        med = new Medicamento(1, 10.5, 45, "AZTREZENECA",0012);
        medicamentoDAO = new MedicamentoDAOImpl();
        servicioMedicamentos = new ServicioMedicamentos(medicamentoDAO);

        try {
            new MedicamentoDAOImpl().crearTablas();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testGuardar() {
        med = new Medicamento(1, 10.5, 45, "AZTREZENECA",0012);
        medicamentoDAO = new MedicamentoDAOImpl();
        servicioMedicamentos = new ServicioMedicamentos(medicamentoDAO);

        try {
            new MedicamentoDAOImpl().crearTablas();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        servicioMedicamentos.guardar(med);

        assertEquals(med,servicioMedicamentos.buscar(1));

    }
   
}