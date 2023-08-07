public class ProcesarDocumento {
    private CompruebaDocumento compruebaDocumento;


    public ProcesarDocumento() {
        CompruebaDocumento filtro1 = new Diputado();
        CompruebaDocumento filtro2 = new Ministro();
        CompruebaDocumento filtro3 = new Presidente();

        filtro1.setSiguiente(filtro2);
        filtro2.setSiguiente(filtro3);
        filtro3.setSiguiente(null);

        compruebaDocumento = filtro1;
    }

    public String crearDocumento (String contenido, int tipo){
        Documento documento = new Documento(contenido, tipo);
        return compruebaDocumento.validarDocumento(documento);
    }

    public CompruebaDocumento getCompruebaDocumento() {
        return compruebaDocumento;
    }

    public void setCompruebaDocumento(CompruebaDocumento compruebaDocumento) {
        this.compruebaDocumento = compruebaDocumento;
    }
}
