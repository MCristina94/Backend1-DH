package model;

import java.util.Date;

public class TarjetaCredito extends Tarjeta{
    private int limite;
    private int saldoUtilizado;

    public TarjetaCredito(int numerosFrente, int codigoSeg, String fechaExpedicion, int limite, int saldoUtilizado) {
        super(numerosFrente, codigoSeg, fechaExpedicion);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(int saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
