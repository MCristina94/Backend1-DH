import DAOs.Impl.MedicamentoDAOImpl;
import Entidades.Medicamento;
import Servicios.ServicioMedicamentos;
import org.apache.log4j.Logger;

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

        servicioMedicamentos.traerMedicamentos();

    }

}
