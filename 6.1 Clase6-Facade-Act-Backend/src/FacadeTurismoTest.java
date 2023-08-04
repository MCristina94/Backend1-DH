import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTurismoTest {
    @Test
    void realizarBusqueda(){

        Vuelo vuelo1 = new Vuelo("01/09/2024", "05/10/2024", "Cali", "Buenos Aires");
        Hotel hotel1 = new Hotel("1/09/2024", "5/10/2024", "Cali");

        FacadeTurismo facade1 = new FacadeTurismo();
        String resultado = facade1.realizarBusqueda(vuelo1, hotel1);
        assertEquals("APROBADO",resultado );
    }

}