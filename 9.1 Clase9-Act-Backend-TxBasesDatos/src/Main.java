import org.apache.log4j.Logger;

import java.sql.SQLException;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) throws SQLException {
        try {
            SQL.inicializarConexion();
        } catch (Exception e) {
            LOGGER.error("No se estableció la conexión", e);
            return;
        }

        Odontologo odontologo = new Odontologo("Marlon", "Lombana", "123456odontologo", 1);

        SQL.crearOdontologo(odontologo);
        SQL.listarOdontologos();
        SQL.cambioMatricula(odontologo, "odontologo1");
        SQL.listarOdontologos();
        SQL.cambioMatricula(odontologo, "odontologo3");
        SQL.listarOdontologos();
    }
}