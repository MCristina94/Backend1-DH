package org.digitalhouse.DAOs.Impl;

import org.digitalhouse.DAOs.MedicamentoDAO;
import org.digitalhouse.Entidades.Medicamento;
import org.digitalhouse.Utils.SQLQueries;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicamentoDAOImpl implements MedicamentoDAO {

    private static final Logger LOG = Logger.getLogger(MedicamentoDAOImpl.class);
    private static Connection connection;

    public MedicamentoDAOImpl(){
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:tcp://localhost/~/test";
            connection = DriverManager.getConnection(url, "sa", "");
        } catch (Exception e) {
            LOG.error("No se pudo crear el DAO", e);
        }
    }

    public void crearTablas() throws SQLException {
        Statement s = connection.createStatement();
        s.execute(SQLQueries.CREATETABLES);
        s.close();
    }


    @Override
    public void guardar(Medicamento medicamento) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.INSERT_CUSTOM)){
            statement.setInt(1,medicamento.getId());
            statement.setInt(2,medicamento.getCodigo());
            statement.setDouble(3,medicamento.getPrecio());
            statement.setInt(4,medicamento.getCantidad());
            statement.setString(5,medicamento.getLaboratorio());
            statement.execute();
        }catch (Exception e){
            LOG.error("No se pudo persistir: " + medicamento,e);
            throw new Exception("Sucedio un error al persistir");
        }

    }

    @Override
    public Medicamento buscar(int id) throws Exception {
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_MEDICAMENTO)){
           statement.setInt(1,id);
            ResultSet resultSet = statement.executeQuery();

            resultSet.last();
            if(resultSet.getRow()==1){
                Medicamento med = new Medicamento();
                med.setId(resultSet.getInt(1));
                med.setCodigo(resultSet.getInt(2));
                med.setPrecio(resultSet.getDouble(3));
                med.setCantidad(resultSet.getInt(4));
                med.setLaboratorio(resultSet.getString(5));
                return med;
            }
            else throw new Exception("Error al buscar medicamento");
        }catch (Exception e){
            LOG.error("No se pudo encontrar el medicamento con Id: " + id,e);
            throw new Exception("Sucedio un error al buscar el medicamento");
        }
    }

    @Override
    public List<Medicamento> buscarPorPrecio(Double precio) {
        List<Medicamento> medicamentoList = new ArrayList<>();
        try(PreparedStatement statement = connection.prepareStatement(SQLQueries.TRAER_MEDICAMENTO_PRECIO)){
            statement.setDouble(1,precio);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Medicamento med = new Medicamento();
                med.setId(resultSet.getInt(1));
                med.setCodigo(resultSet.getInt(2));
                med.setPrecio(resultSet.getDouble(3));
                med.setCantidad(resultSet.getInt(4));
                med.setLaboratorio(resultSet.getString(5));
                medicamentoList.add(med);
                LOG.info(med.toString());
            }

        }catch (Exception e){
            LOG.error("Ha ocurrido un error");
        }

        return medicamentoList;
    }



}
