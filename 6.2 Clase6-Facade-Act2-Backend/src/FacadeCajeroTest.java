import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeCajeroTest {
    @Test
    void retirarDinero(){
        Cuenta cuenta1 = new Cuenta(200000, "12356", "hoalola");
        FacadeCajero facadeCajero = new FacadeCajero();
        String resultado = facadeCajero.retirarDinero(cuenta1, 100000, "123456", "holalola");
        assertEquals("PROCESO FINALIZADO", resultado);
    }

}