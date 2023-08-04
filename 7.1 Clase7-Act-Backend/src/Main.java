import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(Main.class);

        Felinos leon1 = new Leon("Rey", -6, false);
        Felinos tigre1 = new Tigre("sherkan", 11);
        Felinos tigre2 = new Tigre("she", 15);
        Felinos tigre3 = new Tigre("kan", -2);

        try{

            leon1.edadNegativa();


        }catch (Exception e){
            LOGGER.error(e);
        }

        leon1.correr();
        leon1.esMayorA10();


    }
}