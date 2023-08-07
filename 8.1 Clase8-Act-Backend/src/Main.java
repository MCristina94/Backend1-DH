import org.apache.log4j.Logger;
import java.sql.*;
public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            Sql.inicializarConexion();
        } catch (Exception e) {
            LOGGER.error("Algo esta mal ", e);
            return;
        }
        insertarFiguras();
        listarFiguras();
    }

    private static void listarFiguras() {
        try {
            Sql.encontrarFiguras();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private static void insertarFiguras() {
        int i = 0;
        Figura figura1 = new Figura("Cuadrado", "Rojo", ++i);
        Figura figura2 = new Figura("Cuadrado", "Amarillo", ++i);
        Figura figura3 = new Figura("Circulo", "Rojo", ++i);
        Figura figura4 = new Figura("Circulo", "Azul", ++i);

        try {
            Sql.insertarFigura(figura1);
            Sql.insertarFigura(figura2);
            Sql.insertarFigura(figura3);
            Sql.insertarFigura(figura4);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }



    }


