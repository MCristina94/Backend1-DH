import org.apache.log4j.Logger;

public class Tigre extends Felinos {

    private Logger LOGGER = Logger.getLogger(Tigre.class);

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void correr() {
        LOGGER.info("El tigre de nombre: "+getNombre() + " Esta corriendo");
    }

    @Override
    public boolean esMayorA10() {

        if(getEdad()>10){
            LOGGER.info("El tigre "+getNombre()+" es mayor de 10 años");
            return true;
        }
        LOGGER.info("El tigre "+getNombre()+" es menor de 10 años");
        return false;
    }

    public void edadNegativa() throws Exception{
        if(getEdad() < 0) throw new Exception("La edad  de: " +getNombre() +" es negativa");
    }

}
