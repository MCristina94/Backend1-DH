import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String vacuna;
    private Date fechaVacinacion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, String vacuna, Date fechaVacinacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.vacuna = vacuna;
        this.fechaVacinacion = fechaVacinacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public Date getFechaVacinacion() {
        return fechaVacinacion;
    }

    public void setFechaVacinacion(Date fechaVacinacion) {
        this.fechaVacinacion = fechaVacinacion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
