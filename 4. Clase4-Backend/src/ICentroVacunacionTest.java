import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class ICentroVacunacionTest {

    @Test
    void vacunar(){
        ICentroVacunacion centroVacunacion = new Proxy(new CentroVacunacion());

        Persona persona = new Persona("Tomas", "Dozo", "123456", "Moderna", null);
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DAY_OF_MONTH, 2);
        persona.setFechaVacinacion(Date.from(instance.toInstant()));

        assertEquals("NO VACUNADO", centroVacunacion.vacunar(persona));




    }
}