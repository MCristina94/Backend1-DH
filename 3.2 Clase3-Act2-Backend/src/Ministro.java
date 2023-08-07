public class Ministro extends CompruebaDocumento{

    private int tipoAcceso = 2;

    public Ministro() {
    }

    @Override
    public String validarDocumento(Documento documento) {
        if(documento.getTipo() <= tipoAcceso ){
            System.out.println("El ministro puede leer el contenido del documento: " + documento.getContenido() + " de tipo " + documento.getTipo());
            this.getSiguiente().validarDocumento(documento);
            return "AUTORIZADO";
        }else {
            System.out.println("El ministro NO puede leer el contenido del documento");
            this.getSiguiente().validarDocumento(documento);
            return "NO AUTORIZADO";
        }

    }

    public Ministro(int tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public Ministro(CompruebaDocumento siguiente, int tipoAcceso) {
        super(siguiente);
        this.tipoAcceso = tipoAcceso;
    }

    public int getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(int tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }
}
