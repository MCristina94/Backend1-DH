package DAOs.Impl;

import DAOs.AvionDAO;
import Entidades.Avion;
import Utils.SQLQueries;
import org.apache.log4j.Logger;

import java.sql.*;

public class AvionDAOImpl implements AvionDAO {

    private static final Logger LOGGER = Logger.getLogger(AvionDAO.class);
    private static Connection connection;


    public AvionDAOImpl() {
        try{
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:tcp://localhost/~/test";
            connection = DriverManager.getConnection(url, "sa", "");
        }catch (Exception e){
            LOGGER.error("No se pudo crear el DAO", e);
        }
    }


    public void creatTablas()throws Exception{
        Statement statement = connection.createStatement();
        statement.execute(SQLQueries.CREATETABLES);
        statement.close();
    }


    @Override
    public void registrarAvion(Avion avion) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT_CUSTOM)){
            statement.setInt(1, avion.getId());
            statement.setString(2, avion.getMarca());
            statement.setString(3, avion.getModelo());
            statement.setString(4, avion.getModelo());
            statement.setString(5, avion.getFechaServicio());
            statement.execute();
        }catch (Exception e){
                LOGGER.error("No fue posible crear el avion: "+avion, e);
                throw new Exception("Sucedio un error al crear el avion");
        }
    }

    @Override
    public Avion buscarAvion(int id) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_AVION)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            resultSet.last();
            if(resultSet.getRow()==1){
                Avion avion = new Avion();
                avion.setId(resultSet.getInt(1));
                avion.setMarca(resultSet.getString(2));
                avion.setModelo(resultSet.getString(3));
                avion.setModelo(resultSet.getString(4));
                avion.setFechaServicio(resultSet.getString(5));
                return avion;
            }else throw new Exception("Error al buscar el Avion");
        }catch (Exception e){
            LOGGER.error("No fue posible encontrar el avión con id: "+id);
            throw new Exception("sucedio un error al buscar el avión");
        }
    }

    @Override
    public void eliminarAvion(int id) throws Exception {

        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.DELETE_CUSTOM)){
            statement.setInt(1, id);
            statement.execute();
            statement.close();
            LOGGER.info("Se eliminó el avión con id: " + id);
        }catch (Exception e){
            LOGGER.error("ocurrio un error al momento de eliminar el avión con id: "+id);
            throw new Exception("No se elimino el avión");
        }
    }

    @Override
    public void listarAviones() throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_AVIONES)){
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                LOGGER.info("ID avión: " + resultSet.getInt(1) + " marca: " +resultSet.getString(2) + " modelo: " + resultSet.getString(3)+" matricula: " + resultSet.getString(4) + " fecha de servicio: " + resultSet.getString(5));
            }
        }catch (Exception e){
            LOGGER.error("No fue posible hacer impresion de los aviones", e);
        }

    }
}
