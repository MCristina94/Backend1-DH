public abstract class CompruebaDocumento {
    private CompruebaDocumento siguiente;

    public CompruebaDocumento() {
    }

    public CompruebaDocumento(CompruebaDocumento siguiente) {
        this.siguiente = siguiente;
    }

    public CompruebaDocumento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CompruebaDocumento siguiente) {
        this.siguiente = siguiente;
    }
    public abstract String validarDocumento(Documento documento);
}
