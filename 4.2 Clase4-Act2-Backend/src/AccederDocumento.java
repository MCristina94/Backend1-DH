public class AccederDocumento implements IAccederDocumento{
    @Override
    public String traerDocumento(Documento documento, String usuario) {
        System.out.println("Puede acceder el documento: " + documento);
        return "Autorizado";
    }
}
