import DAOs.Impl.OdontologoDAOImpl;
import DAOs.Impl.OdontologoList;
import Entidades.Odontologo;
import Servicios.ServicioOdontoloList;
import Servicios.ServicioOdontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        //Primera implementación con DAO

        OdontologoDAOImpl odontologoDAO = new OdontologoDAOImpl();
        try{
            odontologoDAO.creatTablas();
        }catch (Exception e){
            LOGGER.error("No se pudo crear las tablas", e);
            return;
        }


        ServicioOdontologo servicioOdontologo = new ServicioOdontologo(odontologoDAO);

        Odontologo odontolo1 = new Odontologo(1, 1010, "Manuela", "Ortiz");
        Odontologo odontolo2 = new Odontologo(2, 1254, "Daniel", "Florez");
        Odontologo odontolo3 = new Odontologo(3, 3654, "Cristian", "Lopez");
        Odontologo odontolo4 = new Odontologo(4, 7889, "Luciano", "Menendez");

      //  servicioOdontologo.registrarOdontologo(odontolo1);
       // servicioOdontologo.registrarOdontologo(odontolo2);
       // servicioOdontologo.registrarOdontologo(odontolo3);
       // servicioOdontologo.registrarOdontologo(odontolo4);

       // servicioOdontologo.listarOdontologos();

        //Segunda implementación con List

        OdontologoList odontologoDAO2 = new OdontologoList();

        ServicioOdontoloList servicioOdontoloList = new ServicioOdontoloList(odontologoDAO2);

        try{
            servicioOdontoloList.registrarOdontologo(odontolo1);
            servicioOdontoloList.registrarOdontologo(odontolo2);
            servicioOdontoloList.registrarOdontologo(odontolo3);
            servicioOdontoloList.registrarOdontologo(odontolo4);

        }catch (Exception e){
            LOGGER.error("No fue posible crear odontologo", e);
        }


        try{

            LOGGER.info(servicioOdontoloList.listarOdontologos());
        }catch (Exception e){
            LOGGER.error("No fue posible listar los odontologos" , e);
        }

        /*

        try{
            List<Odontologo> odontologos = odontologoList.listar();
            LOGGER.info("Lista de odontologos");
            for (Odontologo odontologo: odontologos)
            {
                LOGGER.info(odontologo.getId() + " " + odontologo.getMatricula() + " " + odontologo.getNombre() + " " + odontologo.getApellido());
            }

        }catch (Exception e){
            LOGGER.error("No fue posible listar los odontologos" , e);
        }

*/


    }
}