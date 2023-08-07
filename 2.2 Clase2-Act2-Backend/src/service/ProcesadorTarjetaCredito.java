package service;

import model.Tarjeta;
import model.TarjetaCredito;

import java.util.Date;

public class ProcesadorTarjetaCredito extends ProcesadorTarjeta {

    @Override
    protected Boolean autorizacion(Tarjeta tarjeta, int monto) {
        TarjetaCredito tarjetaCredito = (TarjetaCredito) tarjeta;
        int disponible = tarjetaCredito.getLimite() - tarjetaCredito.getSaldoUtilizado();
        if(disponible > monto){
            System.out.println("Autorización efectiva");
            return true;
        }
        return false;
    }

    @Override
    protected void procesarPago(Tarjeta tarjeta, Boolean resultadoAutorizacion, int monto) {
        TarjetaCredito tarjetaCredito = (TarjetaCredito) tarjeta;
        int saldoFinal = tarjetaCredito.getSaldoUtilizado() + monto;
        if(resultadoAutorizacion){
            tarjetaCredito.setSaldoUtilizado(saldoFinal);
            System.out.println("Se procesó el pago, el saldo total utilizado es de : " +tarjetaCredito.getSaldoUtilizado());
        }else {
            System.out.println("No es posible procesar el pago");
        }

    }
}
