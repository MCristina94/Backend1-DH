public class Presidente extends CompruebaDocumento{
    private int tipoAcceso = 3;

    public Presidente() {
    }

    @Override
    public String validarDocumento(Documento documento) {
        System.out.println("El Presidente puede leer el contenido del documento: " + documento.getContenido() + " de tipo " + documento.getTipo());
        return "AUTORIZADO";
    }

    public Presidente(int tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }

    public Presidente(CompruebaDocumento siguiente, int tipoAcceso) {
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
