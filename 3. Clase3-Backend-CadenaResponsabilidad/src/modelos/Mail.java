package modelos;

public class Mail {
    private String origen;
    private String tema;
    private String destino;

    public Mail(String origen, String tema, String destino) {
        this.origen = origen;
        this.tema = tema;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
