import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    private Circulo circulo;
    @org.junit.jupiter.api.Test
    void calcularArea() {
        circulo = new Circulo(3);

        assertEquals((Math.PI*3*3), circulo.calcularArea());
    }
}