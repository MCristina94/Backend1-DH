package service;

import model.Empleado;
import model.EmpleadoContratado;

public class LiquidarSuieldoContratado extends LiquidadoraSueldo{
    @Override
    protected int calcular(Empleado empleado) {
        if(empleado instanceof EmpleadoContratado){
            return((EmpleadoContratado)empleado).getCantHoras()*((EmpleadoContratado)empleado).getPrecioHora();
        }
        else return -1;
    }

    @Override
    protected void imprimir(Empleado empleado, int sueldo) {
        if(sueldo!=-1){
            System.out.println("La liquidación generada es un documento difital. Saldo a liquidar: "+ sueldo);
        }
        else{
            System.out.println("La liquidación no pudo ser calculada");
        }

    }
}

