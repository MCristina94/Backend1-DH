import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesarDocumentoTest {

    @Test
    void crearDocumento(){

        ProcesarDocumento procesarDocumento = new ProcesarDocumento();
        String algo = procesarDocumento.crearDocumento("hola hola", 3);
        assertEquals("NO AUTORIZADO", algo);


    }
}