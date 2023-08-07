public class Diputado extends CompruebaDocumento{

    private int tipoAcceso = 1;

    public Diputado() {
    }

    @Override
    public String validarDocumento(Documento documento) {
        if(documento.getTipo() == tipoAcceso){
            this.getSiguiente().validarDocumento(documento);
            System.out.println("El diputado puede leer el contenido del documento: " + documento.getContenido() + " de tipo " + documento.getTipo());
            return "AUTORIZADO";
        }else{
            System.out.println("El diputado NO puede leer el contenido del documento");
            this.getSiguiente().validarDocumento(documento);
            return "NO AUTORIZADO";

        }

    }

    public Diputado(CompruebaDocumento siguiente, int tipoAcceso) {
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
