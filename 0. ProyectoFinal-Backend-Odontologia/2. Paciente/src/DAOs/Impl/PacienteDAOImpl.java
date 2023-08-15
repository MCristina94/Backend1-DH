package DAOs.Impl;

import DAOs.PacienteDAO;
import Entidades.Paciente;
import Utils.SQLQueriesPaciente;
import org.apache.log4j.Logger;

import java.sql.*;

public class PacienteDAOImpl implements PacienteDAO {

    private static final Logger LOGGER = Logger.getLogger(PacienteDAOImpl.class);

    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public PacienteDAOImpl() {
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
        statement.execute(SQLQueriesPaciente.CREATETABLES);
        statement.close();
    }

    @Override
    public void registrarPaciente(Paciente paciente) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueriesPaciente.INSERT_CUSTOM)){
            statement.setInt(1, paciente.getId());
            statement.setString(2, paciente.getNombre());
            statement.setString(3, paciente.getApellido());
            statement.setString(4, paciente.getDomicilio());
            statement.setDate(5, paciente.getFechaAlta());
            statement.execute();
            LOGGER.info("Se creo un paciente" + paciente);

        }catch (Exception e){
            LOGGER.error("No fue posible crear el paciente" + paciente, e);
            throw new Exception("Sucedio un error al crear el paciente");
        }
    }

    @Override
    public void listarPacientes() throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueriesPaciente.TRAER_PACIENTES)){
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                LOGGER.info("ID paciente " + resultSet.getInt(1) + " Nombre " + resultSet.getString(2) + " Apellido " + resultSet.getString(3) + " domicilio "  + resultSet.getString(4) + " fecha de alta " + resultSet.getDate(5));
            }
        }catch (Exception e) {
            LOGGER.error("No fue posible listar los pacientes", e);
        }
    }

    @Override
    public void modificarPaciente(int id, String nuevoNombre, String nuevoApellido, String nuevoDomicilio, Date nuevaFechaAlta) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueriesPaciente.UPDATE_PACIENTE)){
            statement.setInt(5, id);
            statement.setString(1, nuevoNombre );
            statement.setString(2, nuevoApellido);
            statement.setString(3, nuevoDomicilio);
            statement.setDate(4, nuevaFechaAlta);
            statement.executeUpdate();
            LOGGER.info("Se moficaron los datos del paciente con id: " + id);
        }catch (Exception e){
            LOGGER.error("Se presentó error al modificar los datos ", e);
            throw new Exception("Sucedio un error al modificar");
        }
    }

    @Override
    public void eliminarPaciente(int id) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueriesPaciente.DETELE_CUSTOM)){
            statement.setInt(1, id);
            statement.execute();
            statement.close();
            LOGGER.info("Se elimino el paciente con id: " + id);
        }catch (Exception e){
            LOGGER.error("Se presentó error al eliminar el paciente", e);
            throw new Exception("Sucedio un error al eliminar");
        }
    }
}
