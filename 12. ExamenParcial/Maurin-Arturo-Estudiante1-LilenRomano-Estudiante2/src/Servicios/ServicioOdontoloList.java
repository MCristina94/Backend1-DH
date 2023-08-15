package Servicios;

import DAOs.Impl.OdontologoList;
import DAOs.OdontologoDAO;
import Entidades.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ServicioOdontoloList {

    private OdontologoDAO odontologoDAO;
    private Logger LOGGER = Logger.getLogger(ServicioOdontologo.class);


    public ServicioOdontoloList(OdontologoDAO odontologoDAO) {
        this.odontologoDAO = odontologoDAO;
    }

    public ServicioOdontoloList() {
    }

    public boolean registrarOdontologo(Odontologo odontologo){
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
            return odontologoDAO.listarOdontologos();
        }catch (Exception e){
            return "No Listado";
        }

    }


}
