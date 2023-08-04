package service;

import model.Empleado;
import model.EmpleadoContratado;
import model.EmpleadoEfectivo;

public class LiquidadoraSueldoEfectivo extends LiquidadoraSueldo{


    @Override
    protected int calcular(Empleado empleado) {
        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo)empleado;
            return empleadoEfectivo.getSueldo() + empleadoEfectivo.getPremios() - empleadoEfectivo.getDescuento();
        }
        else return -1;
    }

    @Override
    protected void imprimir(Empleado empleado, int sueldo) {
        if(sueldo!=-1){
            System.out.println("La liquidación generada es un documento impreso. Saldo a liquidar: "+ sueldo);
        }
        else{
            System.out.println("La liquidación no pudo ser calculada");
        }

    }
}
