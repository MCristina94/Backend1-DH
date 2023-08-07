package service;

import model.Tarjeta;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class ProcesadorTarjeta {

    public void procesarAutorizacion(Tarjeta tarjeta, int monto){
        Boolean resultadoAutorizacion = autorizacion(tarjeta, monto);
        procesarPago(tarjeta, resultadoAutorizacion, monto);

    }
    public Boolean validarFechaExpedicion(Tarjeta tarjeta){
        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate fechaIngresada = LocalDate.parse(tarjeta.getFechaExpedicion(), formatter );
        if(fechaIngresada.isBefore(fechaActual)){
            System.out.println("Se autoriza el proceso, la validación de la fecha de expedicion es satisfactoria");
            return true;
        }
        System.out.println("No se autoriza el proceso, la validación no fue satisfactoria");
        return false;
    }

    protected abstract Boolean autorizacion(Tarjeta tarjeta, int monto);
    protected abstract void procesarPago(Tarjeta tarjeta, Boolean resultadoAutorizacion, int monto);
}
