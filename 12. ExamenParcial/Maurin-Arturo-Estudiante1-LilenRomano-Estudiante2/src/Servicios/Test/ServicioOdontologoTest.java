package Servicios.Test;

import DAOs.Impl.OdontologoDAOImpl;
import Entidades.Odontologo;
import Servicios.ServicioOdontologo;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioOdontologoTest {

    private Logger LOGGER = Logger.getLogger(ServicioOdontologoTest.class);
    @Test
    void crearTabla(){

        OdontologoDAOImpl odontologoDAO = new OdontologoDAOImpl();
        try{
            odontologoDAO.creatTablas();
        }catch (Exception e){
            LOGGER.error("No se pudo crear las tablas", e);
            return;
        }
        ServicioOdontologo servicioOdontologo = new ServicioOdontologo(odontologoDAO);

        Odontologo odontolo1 = new Odontologo(1, 1010, "Manuela", "Ortiz");

        assertEquals(true, servicioOdontologo.registrarOdontologo(odontolo1));
    }

    @Test
    void listarOdontologos(){
        OdontologoDAOImpl odontologoDAO = new OdontologoDAOImpl();
        try{
            odontologoDAO.creatTablas();
        }catch (Exception e){
            LOGGER.error("No se pudo crear las tablas", e);
            return;
        }
        ServicioOdontologo servicioOdontologo = new ServicioOdontologo(odontologoDAO);

        Odontologo odontolo1 = new Odontologo(1, 1010, "Manuela", "Ortiz");
        servicioOdontologo.registrarOdontologo(odontolo1);




        assertEquals("Listado", servicioOdontologo.listarOdontologos());

    }

}