package service;

import model.Tarjeta;
import model.TarjetaDebito;
import model.TarjetaCredito;

public class ProcesadorTarjetaDebito extends ProcesadorTarjeta{


    @Override
    protected Boolean autorizacion(Tarjeta tarjeta, int monto) {
        TarjetaDebito tarjetaDebito = (TarjetaDebito) tarjeta;

        if(tarjetaDebito.getSaldoDisponible() > monto){

            System.out.println("Autorización efectiva");
            return true;
        }
        return false;
    }

    @Override
    protected void procesarPago(Tarjeta tarjeta, Boolean resultadoAutorizacion, int monto) {
        TarjetaDebito tarjetaDebito = (TarjetaDebito) tarjeta;
        int saldoFinal = 0;
        if(resultadoAutorizacion){
            saldoFinal = tarjetaDebito.getSaldoDisponible() - monto;
            tarjetaDebito.setSaldoDisponible(saldoFinal);
            System.out.println("Se procesó el pago, el saldo actual es de: "+tarjetaDebito.getSaldoDisponible());

        }else {
            System.out.println("No es posible procesar el pago");
        }

    }
}
