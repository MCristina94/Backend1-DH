package model;

import java.util.Date;

public class TarjetaDebito extends Tarjeta{

    private int saldoDisponible;


    public TarjetaDebito(int numerosFrente, int codigoSeg, String fechaExpedicion, int saldoDisponible) {
        super(numerosFrente, codigoSeg, fechaExpedicion);
        this.saldoDisponible = saldoDisponible;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
