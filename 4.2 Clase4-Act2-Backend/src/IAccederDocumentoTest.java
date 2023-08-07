import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IAccederDocumentoTest {
    @Test
        void traerDocumento() {

        IAccederDocumento accederDocumento = new ProxyAccederDocumento(new AccederDocumento());
        List<String> autorizados = new ArrayList<>();
        autorizados.add("pedro");
        autorizados.add("andres");
        autorizados.add("juan");

        Documento documento1 = new Documento(1, "lola.ong.co", "Este es un documento de la ong", autorizados);

        assertEquals("Autorizado",accederDocumento.traerDocumento(documento1, "juan"));

    }

}