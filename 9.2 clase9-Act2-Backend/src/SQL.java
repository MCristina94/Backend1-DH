import org.apache.log4j.Logger;

import java.sql.*;

public class SQL {
    private static final Logger LOGGER = Logger.getLogger(SQL.class);
    private static Connection connection;

    public static Connection getConnection() {
        return connection;
    }

    public static void iniciarConexion() throws Exception{
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:tcp://localhost/~/test";
        connection = DriverManager.getConnection(url, "sa", "");

        Statement statement = connection.createStatement();
        statement.execute(SQLQueries.CREATETABLES);
        statement.close();
        LOGGER.info("Se creo la tabla pacientes");
    }

    public static void traerPacientes(){
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAERPACIENTES)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                LOGGER.info("ID "+resultSet.getInt(1) + " Nombre Paciente " + resultSet.getString(2)+ " Apellido Paciente " + resultSet.getString(3) + " Domicilio " + resultSet.getString(4)+ " DNI " + resultSet.getInt(5) + " Fecha Alta " + resultSet.getString(6)+ " USUARIO " + resultSet.getString(7) + " CONTRASEÑA " + resultSet.getString(8));

            }

            }catch (Exception e){
            LOGGER.error("No se pudo listar los pacientes", e);
        }
    }
    public static void crearPaciente(Paciente paciente){
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT)){
            statement.setInt(1, paciente.getId());
            statement.setString(2, paciente.getNombre());
            statement.setString(3, paciente.getApellido());
            statement.setString(4, paciente.getDomicilio());
            statement.setInt(5, paciente.getDni());
            statement.setString(6, paciente.getFechaAlta());
            statement.setString(7, paciente.getUsuario());
            statement.setString(8, paciente.getPassword());
            statement.execute();

        }catch (Exception e){
            LOGGER.error("No fue posible crear el paciente", e);
        }
    }

    public static void cambiarPassword(Paciente paciente, String nuevoPassword){
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.UPDATE)){
            connection.setAutoCommit(false);
            statement.setString(1, nuevoPassword);
            statement.setString(2, paciente.getUsuario());
            statement.executeUpdate();
            int a = 2/0;

            connection.commit();

        }catch (Exception e){
            try{
                connection.rollback();
            }catch (Exception err){

            }
        }

        try{
            connection.setAutoCommit(true);
        }catch (Exception error){

        }

    }

}
