package Servicios;

import DAOs.Impl.OdontologoDAOImpl;
import DAOs.OdontologoDAO;
import Entidades.Odontologo;
import org.apache.log4j.Logger;

public class ServicioOdontologo {

    private OdontologoDAO odontologoDAO;
    private Logger LOGGER = Logger.getLogger(ServicioOdontologo.class);


    public ServicioOdontologo() {
    }

    public ServicioOdontologo(OdontologoDAO odontologoDAO) {
        this.odontologoDAO = odontologoDAO;
    }

    public boolean registrarOdontologo(Odontologo odontologo){

        //ejecutamos el metodo
        try{
            odontologoDAO.registrarOdontologo(odontologo);
        }catch (Exception e){
            LOGGER.error("Hay un error", e);
            return false;
        }

        return true;

    }

    public String listarOdontologos(){
        try{
            odontologoDAO.listarOdontologos();
        }catch (Exception e){
            return "No listado";
        }
        return "Listado";
    }


}
