package model;

public class EmpleadoContratado extends Empleado{

    private int precioHora;
    private int cantHoras;

    public EmpleadoContratado(String nombre, String apellido, String cuenta, int precioHora, int cantHoras) {
        super(nombre, apellido, cuenta);
        this.precioHora = precioHora;
        this.cantHoras = cantHoras;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

}
