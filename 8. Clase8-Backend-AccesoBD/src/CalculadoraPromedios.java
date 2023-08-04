import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class CalculadoraPromedios {

    private final static Logger LOGGER = Logger.getLogger(CalculadoraPromedios.class);


    public static double calcularPromedio(List<Integer> lista) {

//        LOGGER.fatal("Esto es un FATAL");
//        LOGGER.error("Esto es un ERROR");
//        LOGGER.warn("Esto es un WARN");
//        LOGGER.info("Esto es un INFO");
//        LOGGER.debug("ESto es un DEBUG");
//        LOGGER.trace("Esto es un TRACE");
        try{
            //Codigo duduoso
            throw new NullPointerException();
        }catch (Exception e){
            LOGGER.error("Se rompio algo", e);
            System.out.println(Arrays.asList(new String().equals(new String())));
        }
        return 0;
    }

}
