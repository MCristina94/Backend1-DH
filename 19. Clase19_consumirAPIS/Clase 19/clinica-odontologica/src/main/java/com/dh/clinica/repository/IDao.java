package com.dh.clinica.repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IDao<T> {

     T guardar(T t) throws ClassNotFoundException, SQLException;
     T buscar(Integer id) throws ClassNotFoundException, SQLException;
     void eliminar(Integer id) throws ClassNotFoundException, SQLException;
     List<T> buscarTodos() throws ClassNotFoundException, SQLException;
     T actualizar(T t) throws SQLException, ClassNotFoundException;


}
