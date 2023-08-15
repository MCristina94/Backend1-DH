package org.digitalhouse.Entidades;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medicamento that)) return false;
        return id == that.id && codigo == that.codigo && Double.compare(that.precio, precio) == 0 && cantidad == that.cantidad && laboratorio.equals(that.laboratorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, precio, cantidad, laboratorio);
    }
}
