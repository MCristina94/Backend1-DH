package Servicios;

import DAOs.AvionDAO;
import Entidades.Avion;
import org.apache.log4j.Logger;

public class ServicioAvion {
    private AvionDAO avionDAO;
    private Logger LOGGER = Logger.getLogger(ServicioAvion.class);

    public ServicioAvion(AvionDAO avionDAO) {
        this.avionDAO = avionDAO;
    }

    public boolean registrarAvion(Avion avion){
        //validar si la matricula no esta vacia
        if(avion.getMatricula().isBlank()){
            LOGGER.warn("Matricula vacia");
            return false;
        }

        //ejecutar el metodo
        try{
            avionDAO.registrarAvion(avion);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public Avion buscarAvion(int id){
        Avion avion = null;
        try{
            avion = avionDAO.buscarAvion(id);
        }catch (Exception e){
            LOGGER.error("error", e);

        }
        return avion;
    }

    public void eliminarAvion(int id){
        try{
            avionDAO.eliminarAvion(id);
        }catch (Exception e){

        }
    }

    public void listarAviones(){
        try{
            avionDAO.listarAviones();
        }catch (Exception e){

        }
    }


}
