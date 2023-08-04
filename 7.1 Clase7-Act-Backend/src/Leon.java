import org.apache.log4j.Logger;

public class Leon extends Felinos {
    private Logger LOGGER = Logger.getLogger(Leon.class);
    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) {
        super(nombre, edad);
        this.esAlfa = esAlfa;
    }

    public boolean isEsAlfa() {
        return esAlfa;
    }

    public void setEsAlfa(boolean esAlfa) {
        this.esAlfa = esAlfa;
    }

    @Override
    public void correr() {
        LOGGER.info("El león de nombre: "+getNombre() + " Esta corriendo");
    }

    @Override
    public boolean esMayorA10() {

        if(getEdad()>10 && esAlfa == true){
            LOGGER.info("El Leon "+getNombre()+" es mayor de 10 años y es alfa");
            return true;
        }else if(getEdad()>10 && esAlfa == false){
            LOGGER.info("El Leon "+getNombre()+" es mayor de 10 años y no es alfa");
            return true;
        }
        LOGGER.info("El Leon "+getNombre()+" es menor de 10 años");
        return false;
    }
    public void edadNegativa()throws Exception{
        if(getEdad() < 0) throw new Exception("La edad  de: " +getNombre() +" es negativa");
    }
}
