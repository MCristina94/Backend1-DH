import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    private Grupo grupo;

    @BeforeEach
    public void inicializar(){
        grupo = new Grupo();
    }

    @Test
    public void agregarPersona() {
        Persona persona1 = new Persona("juan", 20);
        Persona persona2 = new Persona("pedro", 17);
        Persona persona3 = new Persona("Ana", 22);
        Persona persona4 = new Persona("Luz", 14);
        Persona persona5 = new Persona("Julian", 32);

        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);
        grupo.agregarPersona(persona3);
        grupo.agregarPersona(persona4);
        grupo.agregarPersona(persona5);

        assertEquals(3, grupo.getLista().size());
    }
@Test
    public void agregarPersonaConEdadNoValida(){
    Persona persona1 = new Persona("juan", 20);
    Persona persona2 = new Persona("pedro", 17);
    Persona persona3 = new Persona("Ana", 22);
    Persona persona4 = new Persona("Luz", 14);
    Persona persona5 = new Persona("Julian", 32);

    grupo.agregarPersona(persona1);
    grupo.agregarPersona(persona2);
    grupo.agregarPersona(persona3);
    grupo.agregarPersona(persona4);
    grupo.agregarPersona(persona5);

    assertEquals(3, grupo.getLista().size());

}
}