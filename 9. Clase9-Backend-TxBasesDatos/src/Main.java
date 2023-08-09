import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            SQL.inicializarConexion();
        } catch (Exception e){
            LOGGER.error("Se rompio todo", e);
            return;
        }

        Cuentas cuenta1 = new Cuentas(1,"Tomás",5);

        SQL.crearCuenta(cuenta1);
        SQL.listarCuentas();
        SQL.sumar10(cuenta1);
        SQL.listarCuentas();
        SQL.sumar15(cuenta1);
        SQL.listarCuentas();
        LOGGER.info("Objeta cuentas con saldo: " + cuenta1.getSaldo());
    }

}
