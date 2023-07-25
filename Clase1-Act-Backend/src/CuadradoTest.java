import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    private Cuadrado cuadrado;

    @org.junit.jupiter.api.Test
    void calcularArea() {
        cuadrado = new Cuadrado(2.0);

        assertEquals(4, cuadrado.calcularArea());
    }
}