import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;

public class SQL {
    private final static Logger LOGGER = Logger.getLogger(SQL.class);
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
        LOGGER.info("Se creo tabla odontologos");
    }

    public static void crearOdontologo(Odontologo odontologo){
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT)){
            statement.setInt(1, odontologo.getId());
            statement.setString(2, odontologo.getNombre());
            statement.setString(3, odontologo.getApellido());
            statement.setString(4, odontologo.getMatricula());
            statement.execute();
            LOGGER.info("Se añadio odontologo");
        }catch (Exception e){

        }
    }

    public static void cambioMatricula(Odontologo odontologo, String nuevaMatricula) throws SQLException {
        connection.setAutoCommit(false);

        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.UPDATE)){
            statement.setString(1, nuevaMatricula);
            statement.setString(2, odontologo.getNombre());

            statement.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
            LOGGER.info("Se cambio matricula del odontologo");
        }catch (Exception e){

            LOGGER.error(e);
        }
    }

    public static void listarOdontologos(){
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_ODONTOLOGOS)){
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                LOGGER.info(" ID PROFESIONAL " +resultSet.getInt(1)+" Odontologo "+resultSet.getString(2)+ " " + resultSet.getString(3)+ " con matricula "+ resultSet.getString(4));
            }
        }catch (Exception e){
            LOGGER.error(e);
        }
    }

}
