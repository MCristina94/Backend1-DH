public class Hotel {
    private String fechaSalida;
    private String fechaRegreso;
    private String ciudadDestino;

    public Hotel(String fechaSalida, String fechaRegreso, String ciudadDestino) {
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.ciudadDestino = ciudadDestino;
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
}
