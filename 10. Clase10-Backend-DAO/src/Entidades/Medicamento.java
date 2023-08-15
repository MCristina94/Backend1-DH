package Entidades;

public class Medicamento {
    private int id;
    private int codigo;
    private double precio;
    private int cantidad;
    private String laboratorio;

    @Override
    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", laboratorio='" + laboratorio + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Medicamento() {
    }

    public Medicamento(int id, double precio, int cantidad, String laboratorio, int codigo) {
        this.id = id;
        this.precio = precio;
        this.cantidad = cantidad;
        this.laboratorio = laboratorio;
        this.codigo = codigo;
    }
}
