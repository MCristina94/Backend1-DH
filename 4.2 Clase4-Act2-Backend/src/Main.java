import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> autorizados = new ArrayList<>();
       autorizados.add("pedro");
       autorizados.add("andres");
       autorizados.add("juan");

        Documento documento = new Documento(1, "lola.ong.co", "Este es un documento de la ong", autorizados);
        IAccederDocumento accederDocumento = new ProxyAccederDocumento(new AccederDocumento());
        System.out.println(accederDocumento.traerDocumento(documento, "pedro"));
    }
}