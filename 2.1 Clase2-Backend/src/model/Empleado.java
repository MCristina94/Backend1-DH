package model;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String cuenta;

    public Empleado(String nombre, String apellido, String cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

}
