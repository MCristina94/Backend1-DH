package com.dh.clinica.repository.impl;

import com.dh.clinica.repository.IDao;
import com.dh.clinica.model.Odontologo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;


import java.sql.*;
import java.util.ArrayList;

import java.util.List;

@Repository
public class OdontologoDaoH2 implements IDao<Odontologo> {

    final static Logger log = Logger.getLogger(OdontologoDaoH2.class);

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    //con la instruccion INIT=RUNSCRIPT cuando se conecta a la base ejecuta el script de sql que esta en dicho archivo
    private final static String DB_URL = "jdbc:h2:tcp://localhost/~/test";
    private final static String DB_USER ="sa";
    private final static String DB_PASSWORD = "";


    @Override
    public Odontologo guardar(Odontologo odontologo) throws ClassNotFoundException, SQLException {
        log.debug("guardando un nuevo odontologo");
        Connection connection = null;
        PreparedStatement preparedStatement = null;

            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //2 Crear una sentencia especificando que el ID lo auto incrementa la base de datos y que nos devuelva esa Key es decir ID
            preparedStatement = connection.prepareStatement("INSERT INTO odontologos(nombre,apellido,matricula) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            //No le vamos a pasar el ID ya que hicimos que fuera autoincremental en la base de datos
            //preparedStatement.setInt(1,odontologo.getId());
            preparedStatement.setString(1, odontologo.getNombre());
            preparedStatement.setString(2, odontologo.getApellido());
            preparedStatement.setInt(3, odontologo.getMatricula());

            //3 Ejecutar una sentencia SQL y obtener los ID que se autogeneraron en la base de datos
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next())
                odontologo.setId(keys.getInt(1));

            preparedStatement.close();


        return odontologo;
    }

    @Override
    public void eliminar(Integer id) throws ClassNotFoundException, SQLException {
        log.debug("Borrando odontologo con id : "+id);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //2 Crear una sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM odontologos where id = ?");
            preparedStatement.setInt(1,id);

            //3 Ejecutar una sentencia SQL
            preparedStatement.executeUpdate();
            preparedStatement.close();



    }

    @Override
    public Odontologo buscar(Integer id) throws ClassNotFoundException, SQLException {
        log.debug("Buscando al odontologo con id = " + id);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Odontologo odontologo = null;

            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //2 Crear una sentencia
            preparedStatement = connection.prepareStatement("SELECT id,nombre,apellido,matricula FROM odontologos where id = ?");
            preparedStatement.setInt(1,id);

            //3 Ejecutar una sentencia SQL
            ResultSet result = preparedStatement.executeQuery();

            //4 Obtener resultados
            while (result.next()) {
                int idPaciente = result.getInt("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                int matricula = result.getInt("matricula");

                odontologo = new Odontologo(idPaciente,nombre,apellido,matricula);
            }

            preparedStatement.close();


        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() throws ClassNotFoundException, SQLException {
        log.debug("Buscando todos los odontologos");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();
            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //2 Crear una sentencia
            preparedStatement = connection.prepareStatement("SELECT *  FROM odontologos");

            //3 Ejecutar una sentencia SQL
            ResultSet result = preparedStatement.executeQuery();

            //4 Obtener resultados
            //4 Obtener resultados
            while (result.next()) {
                int idOdontologo = result.getInt("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                int matricula = result.getInt("matricula");

                Odontologo odontologo = new Odontologo(idOdontologo,nombre,apellido,matricula);
                odontologos.add(odontologo);
            }

            preparedStatement.close();


        return odontologos;
    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) throws SQLException, ClassNotFoundException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;


            //1 Levantar el driver y Conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


            //2 Crear una sentencia
            preparedStatement = connection.prepareStatement("UPDATE odontologos SET nombre = ?, apellido = ?,matricula = ?  WHERE id = ?");
            //No le vamos a pasar el ID ya que hicimos que fuera autoincremental en la base de datos
            //preparedStatement.setInt(1,odontologo.getId());
            preparedStatement.setString(1, odontologo.getNombre());
            preparedStatement.setString(2, odontologo.getApellido());
            preparedStatement.setInt(3, odontologo.getMatricula());
            preparedStatement.setInt(4, odontologo.getId());


            //3 Ejecutar una sentencia SQL
            preparedStatement.executeUpdate();


            preparedStatement.close();


        return odontologo;
    }

}
