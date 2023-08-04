public class Vuelo {

    private String fechaSalida;
    private String fechaRegreso;
    private String ciudadDestino;
    private String ciudadOrigen;

    public Vuelo(String fechaSalida, String fechaRegreso, String ciudadDestino, String ciudadOrigen) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }
}
