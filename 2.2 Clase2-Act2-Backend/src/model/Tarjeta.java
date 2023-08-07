package model;

import java.util.Date;

public abstract class Tarjeta {
    private int numerosFrente;
    private int codigoSeg;
    private String fechaExpedicion;


    public Tarjeta(int numerosFrente, int codigoSeg, String fechaExpedicion) {
        this.numerosFrente = numerosFrente;
        this.codigoSeg = codigoSeg;
        this.fechaExpedicion = fechaExpedicion;
    }

    public int getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(int numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public int getCodigoSeg() {
        return codigoSeg;
    }

    public void setCodigoSeg(int codigoSeg) {
        this.codigoSeg = codigoSeg;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
}
