import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

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

    public static void insertarAnimal(Animal animal) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT_CUSTOM);
        statement.setInt(1, animal.getId());
        statement.setString(2, animal.getNombre());
        statement.setString(3, animal.getTipo());
        statement.execute();
        statement.close();
        LOG.info("Se creo el animal: " + animal.getNombre());
    }

    public static List<Animal> encontrarAnimales() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SQLQueries.TRAER_ANIMALES);

        while (resultSet.next()) {
            LOG.info(" Indice: " + resultSet.getInt(1));
            LOG.info(" Nombre: " + resultSet.getString(2));
            LOG.info(" Tipo: " + resultSet.getString(3));
        }

//TODO
        return null;
    }

    public static void elminarAnimal(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(SQLQueries.DELETE_CUSTOM);
        statement.setInt(1, id);
        statement.execute();
        statement.close();
        LOG.info("Se elinmino el animal: " + id);

    }

    public static void actualizarAnimal(Animal animal) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(SQLQueries.UPDATE_CUSTOM);
        statement.setInt(3, animal.getId());
        statement.setString(1, animal.getNombre());
        statement.setString(2, animal.getTipo());
        statement.execute();
        statement.close();
        LOG.info("Se actualizo el animal: " + animal.getNombre());
    }


}
