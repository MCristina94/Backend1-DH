import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

public class Sql {

    private static final Logger LOGGER = Logger.getLogger(Sql.class);
    private static Connection connection;

    public static Connection getConnection(){
        return connection;
    }

    public static void inicializarConexion() throws Exception {
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:tcp://localhost/~/test";
        connection = DriverManager.getConnection(url, "sa", "");

        Statement s = connection.createStatement();
        s.execute(SqlQueries.CREATETABLES);
        s.close();
    }

    public static void insertarFigura(Figura figura) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(SqlQueries.INSERT_CUSTOM);
        statement.setInt(1, figura.getId());
        statement.setString(2,figura.getTipoFigura());
        statement.setString(3, figura.getColor());
        statement.execute();
        LOGGER.info("Se creo una figura");
    }

    public static List<Figura> encontrarFiguras() throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(SqlQueries.TRAER_FIGURAS);

        while(resultSet.next()){
            LOGGER.info(" Indice: " + resultSet.getInt(1));
            LOGGER.info(" Tipo de figura: " + resultSet.getString(2));
            LOGGER.info(" Color: " + resultSet.getString(3));

        }
        return null;
    }

}
