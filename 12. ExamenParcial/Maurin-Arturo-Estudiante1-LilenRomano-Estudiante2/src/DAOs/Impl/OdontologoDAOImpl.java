package DAOs.Impl;

import DAOs.OdontologoDAO;
import Entidades.Odontologo;
import Utils.SQLQueries;
import org.apache.log4j.Logger;

import java.sql.*;

public class OdontologoDAOImpl implements OdontologoDAO {
    private static final Logger LOGGER = Logger.getLogger(OdontologoDAOImpl.class);
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public OdontologoDAOImpl() {
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:tcp://localhost/~/test";
            connection = DriverManager.getConnection(url, "sa", "");
        } catch (Exception e) {
            LOGGER.error("No se pudo crear la conexión DAO", e);
        }
    }

    public void creatTablas() throws Exception {
        Statement statement = connection.createStatement();
        statement.execute(SQLQueries.CREATETABLES);
        statement.close();
    }

    @Override
    public void registrarOdontologo(Odontologo odontologo) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT_CUSTOM)){
            statement.setInt(1, odontologo.getId());
            statement.setInt(2, odontologo.getMatricula());
            statement.setString(3, odontologo.getNombre());
            statement.setString(4, odontologo.getApellido());
            statement.execute();
            LOGGER.info("Se creo un odontologo" + odontologo);

        }catch (Exception e){
            LOGGER.error("No fue posible crear el odontologo" + odontologo, e);
            throw new Exception("Sucedio un error al crear el odontologo");
        }
    }

    @Override
    public String listarOdontologos() throws Exception {

        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_ODONTOLOGOS)){
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                LOGGER.info("ID Odontologo " + resultSet.getInt(1) + " Matricula " + resultSet.getInt(2) + " Nombre " + resultSet.getString(3) + " Apellido "  + resultSet.getString(4));
            }
        }catch (Exception e) {
            LOGGER.error("No fue posible listar los odontologos", e);

            return "No listado";
        }

        return "Listado";
    }
}
