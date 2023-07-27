import java.sql.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Tomas", "Dozo", "123456", "Moderna", null);
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, 2);
        persona.setFechaVacinacion(Date.from(instance.toInstant()));

        ICentroVacunacion centroVacunacion = new Proxy(new CentroVacunacion());

        System.out.println( centroVacunacion.vacunar(persona));

    }
}