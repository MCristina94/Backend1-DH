package DAOs.Impl;

import DAOs.OdontologoDAO;
import Entidades.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoList implements OdontologoDAO {

    private List<Odontologo> odontologos;
    private static final Logger LOGGER = Logger.getLogger(OdontologoList.class);


    public OdontologoList(){
        odontologos = new ArrayList<>();
    }


    @Override
    public void registrarOdontologo(Odontologo odontologo) throws Exception {

            odontologos.add(odontologo);


    }

    @Override
    public String listarOdontologos() throws Exception {

        return odontologos.toString();

    }


}
