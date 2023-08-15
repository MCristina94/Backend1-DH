import DAOs.Impl.OdontologoDAOImpl;
import Entidades.Odontologo;
import Servicios.ServicioOdontologo;
import org.apache.log4j.Logger;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        //creando tabla odontologo

        OdontologoDAOImpl odontologoDAO = new OdontologoDAOImpl();
        try{
            odontologoDAO.creatTablas();
        }catch (Exception e){
            LOGGER.error("No se pudo crear las tablas", e);
            return;
        }

        ServicioOdontologo servicioOdontologo = new ServicioOdontologo(odontologoDAO);

        //Creando odontologos para prueba
        Odontologo odontolo1 = new Odontologo(1, 1010, "Manuela", "Ortiz");
        Odontologo odontolo2 = new Odontologo(2, 1254, "Daniel", "Florez");
        Odontologo odontolo3 = new Odontologo(3, 3654, "Cristian", "Lopez");
        Odontologo odontolo4 = new Odontologo(4, 7889, "Luciano", "Menendez");

        //registrando odontologos en la tabla
        servicioOdontologo.registrarOdontologo(odontolo1);
        servicioOdontologo.registrarOdontologo(odontolo2);
        servicioOdontologo.registrarOdontologo(odontolo3);
        servicioOdontologo.registrarOdontologo(odontolo4);

        //listando los odontologos ingresados a la tabla
        servicioOdontologo.listarOdontologos();

        //Modificando odontologo
        servicioOdontologo.modificarOdontologo(1, "Maureen", "Ortiz", 0000);
        servicioOdontologo.listarOdontologos();

        //eliminando odontologo
        servicioOdontologo.eliminarOdontologo(2);
        servicioOdontologo.listarOdontologos();
    }
}