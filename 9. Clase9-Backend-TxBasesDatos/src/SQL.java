import org.apache.log4j.Logger;

import java.sql.*;

public class SQL {
    private static final Logger LOG = Logger.getLogger(SQL.class);
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void inicializarConexion() throws Exception {
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:tcp://localhost/~/test";
        connection = DriverManager.getConnection(url, "sa", "");

        Statement s = connection.createStatement();
        s.execute(SQLQueries.CREATETABLES);
        s.close();
    }

    public static void listarCuentas() {
        try (PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_CUENTAS)) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                LOG.info("Cuenta: " + resultSet.getInt(1) + "  " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }
        } catch (SQLException e) {
        }
    }

    public static void crearCuenta(Cuentas cuentas) {
        try (PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT_CUSTOM)) {
            statement.setInt(1, cuentas.getId());
            statement.setString(2, cuentas.getNombre());
            statement.setInt(3, (int) cuentas.getSaldo());
            statement.execute();
        } catch (SQLException e) {
        }
    }

    public static void sumar10(Cuentas cuentas) {
        try (PreparedStatement statement = connection.prepareStatement(SQLQueries.UPDATE_CUSTOM)) {
            statement.setInt(3, cuentas.getId());
            statement.setString(1, cuentas.getNombre());
            statement.setInt(2, (int) cuentas.getSaldo() + 10);
            statement.executeUpdate();
            cuentas.setSaldo(cuentas.getSaldo() + 10);
        } catch (SQLException e) {
        }


    }

    public static void sumar15(Cuentas cuentas) {

        try (PreparedStatement statement = connection.prepareStatement(SQLQueries.UPDATE_CUSTOM)) {
            connection.setAutoCommit(false);
            statement.setInt(3, cuentas.getId());
            statement.setString(1, cuentas.getNombre());
            statement.setInt(2, (int) cuentas.getSaldo() + 15);
            statement.executeUpdate();
            int a = 2 / 0;

            connection.commit();
            cuentas.setSaldo(cuentas.getSaldo() + 15);
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {

            }
        }

        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
        }


    }
}
