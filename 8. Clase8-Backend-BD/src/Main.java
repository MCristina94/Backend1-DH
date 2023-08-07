import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            SQL.inicializarConexion();
        } catch (Exception e){
            LOGGER.error("Se rompio todo", e);
            return;
        }

        insertarAnimales();

        listarAnimales();

        eliminarAnimal(3);

        listarAnimales();

        actualizarAnimal();

        listarAnimales();


    }

    private static void actualizarAnimal() {
        try{
            SQL.actualizarAnimal(new Animal("PERRAZO"," Paco 2.0",1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void eliminarAnimal(int id) {
        try {
            SQL.elminarAnimal(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listarAnimales() {
        try {
            SQL.encontrarAnimales();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void insertarAnimales() {
        int i = 0;
        Animal animal1 = new Animal("PERRO","Paco",++i);
        Animal animal2 = new Animal("PERRO","Paquita",++i);
        Animal animal3 = new Animal("GATO","Snowball",++i);
        Animal animal4 = new Animal("ELEFANTE","Dumbo",++i);
        Animal animal5 = new Animal("JIRAFA","Cuello Largo",++i);

        try {
            SQL.insertarAnimal(animal1);
            SQL.insertarAnimal(animal2);
            SQL.insertarAnimal(animal3);
            SQL.insertarAnimal(animal4);
            SQL.insertarAnimal(animal5);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
