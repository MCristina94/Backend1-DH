public class ProxyAccederDocumento implements IAccederDocumento{
    private AccederDocumento accederDocumento;

    @Override
    public String traerDocumento(Documento documento, String usuario) {
        for(String elemento : documento.getUsuariosAutorizados()){
            if(elemento.equals(usuario)){
                return accederDocumento.traerDocumento(documento, usuario);
            }
        }
        System.out.println("usuario no autorizado para acceder al documento " +documento.getId());
        return "NO AUTORIZADO";

    }

    public ProxyAccederDocumento(AccederDocumento accederDocumento) {
        this.accederDocumento = accederDocumento;
    }

    public AccederDocumento getAccederDocumento() {
        return accederDocumento;
    }

    public void setAccederDocumento(AccederDocumento accederDocumento) {
        this.accederDocumento = accederDocumento;
    }
}
