import DAOs.Impl.AvionDAOImpl;
import Entidades.Avion;
import Servicios.ServicioAvion;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.Loader;

public class Main {
    private  final static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        AvionDAOImpl avionDAO = new AvionDAOImpl();
        try{
            avionDAO.creatTablas();
        }catch (Exception e){
            LOGGER.error("No se pudo crear las tablas", e);
            return;
        }

        ServicioAvion servicioAvion = new ServicioAvion(avionDAO);
        Avion avion1 = new Avion(1, "ITT", "2010","XXLS222", "2022-02-23");
        Avion avion2 = new Avion(2, "BENDIX", "2015","KKK123", "2022-02-23");
        Avion avion3 = new Avion(3, "I3M", "2022","LGYGA121", "2022-02-23");
        Avion avion4 = new Avion(4, "ITT", "2011","OKOK333", "2022-02-23");

        servicioAvion.registrarAvion(avion1);
        servicioAvion.registrarAvion(avion2);
        servicioAvion.registrarAvion(avion3);
        servicioAvion.registrarAvion(avion4);
        //servicioAvion.listarAviones();
        //servicioAvion.buscarAvion(1); ---> tiene un error
        //servicioAvion.eliminarAvion(1);
        //LOGGER.info("Se esta intento eliminar el avion 1");
        //servicioAvion.listarAviones();


        Avion avion5 = new Avion();
        avion5 = servicioAvion.buscarAvion(3);
        LOGGER.info("se encontro el avion: " + avion5);

    }
}