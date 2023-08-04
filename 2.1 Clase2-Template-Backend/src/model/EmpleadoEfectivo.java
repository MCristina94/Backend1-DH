package model;

public class EmpleadoEfectivo extends Empleado{

    private int sueldo;
    private int descuento;
    private int premios;

    public EmpleadoEfectivo(String nombre, String apellido, String cuenta, int sueldo, int descuento, int premios) {
        super(nombre, apellido, cuenta);
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.premios = premios;
    }

    public int getSueldo() {
        return sueldo;
    }

    public int getDescuento() {
        return descuento;
    }

    public int getPremios() {
        return premios;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }


}
