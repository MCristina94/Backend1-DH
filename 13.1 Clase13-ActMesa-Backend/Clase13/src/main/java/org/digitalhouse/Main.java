package org.digitalhouse;



import org.apache.log4j.Logger;
import org.digitalhouse.DAOs.Impl.MedicamentoDAOImpl;
import org.digitalhouse.Entidades.Medicamento;
import org.digitalhouse.Servicios.ServicioMedicamentos;

import java.sql.SQLException;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        MedicamentoDAOImpl medicamentoDAO = new MedicamentoDAOImpl();
        try {
            medicamentoDAO.crearTablas();
        } catch (SQLException e) {
            LOGGER.error("No se pudieron crear las tablas", e);
            return;
        }

        ServicioMedicamentos servicioMedicamentos = new ServicioMedicamentos(medicamentoDAO);

        Medicamento med = new Medicamento(1, 135.5, 100, "Bago", 5436);

        LOGGER.info("Intentando persistir al medicamento: " + med);
        servicioMedicamentos.guardar(med);

        med = servicioMedicamentos.buscar(1);

        LOGGER.info("Medicamento obtenido de la base de datos: " + med);

        Medicamento med2 = new Medicamento(2, 195.5, 100, "Bago", 5436);
        servicioMedicamentos.guardar(med2);

        Medicamento med3 = new Medicamento(3, 100.5, 20, "Goku", 5435);
        servicioMedicamentos.guardar(med3);

        Medicamento med4 = new Medicamento(4, 100.5, 300, "Nutrilon", 5446);
        servicioMedicamentos.guardar(med4);

        servicioMedicamentos.buscarPorPrecio(100.5);

    }

}
