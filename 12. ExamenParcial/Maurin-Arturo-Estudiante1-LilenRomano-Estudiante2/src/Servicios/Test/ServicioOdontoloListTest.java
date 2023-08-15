package Servicios.Test;


import DAOs.Impl.OdontologoList;
import Entidades.Odontologo;
import Servicios.ServicioOdontoloList;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServicioOdontoloListTest {
    private static final Logger LOGGER = Logger.getLogger(ServicioOdontoloListTest.class);

    @Test
    void registrarOdontologo(){
        Odontologo odontolo1 = new Odontologo(1, 1010, "Manuela", "Ortiz");

        OdontologoList odontologoList = new OdontologoList();
        try{
            odontologoList.registrarOdontologo(odontolo1);


        }catch (Exception e){
            LOGGER.error("No fue posible crear odontologo", e);
        }

        ServicioOdontoloList servicioOdontoloList = new ServicioOdontoloList(odontologoList);


        assertEquals(true, servicioOdontoloList.registrarOdontologo(odontolo1));

    }

    @Test
    void listarOdontologo() {

            Odontologo odontolo1 = new Odontologo(1, 1010, "Manuela", "Ortiz");

            OdontologoList odontologoList = new OdontologoList();
            try {
                odontologoList.registrarOdontologo(odontolo1);


            } catch (Exception e) {
                LOGGER.error("No fue posible crear odontologo", e);
            }

            ServicioOdontoloList servicioOdontoloList = new ServicioOdontoloList(odontologoList);


            String listaEsperada = "[Odontologo{id=1, matricula=1010, nombre='Manuela', apellido='Ortiz'}]";
            assertEquals(listaEsperada, servicioOdontoloList.listarOdontologos());
        }

}