public class Cuenta {
    private int saldoCuenta;
    private String dni;
    private String contrasenia;

    public Cuenta(int saldoCuenta, String dni, String contrasenia) {
        this.saldoCuenta = saldoCuenta;
        this.dni = dni;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
