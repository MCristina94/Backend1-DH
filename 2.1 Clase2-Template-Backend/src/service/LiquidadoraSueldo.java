package service;

import model.Empleado;

public abstract class LiquidadoraSueldo {
    public void liquidarSueldo(Empleado empleado){
        int sueldo = calcular(empleado);
        imprimir(empleado, sueldo);
        depositar(empleado, sueldo);
    }

    protected abstract int calcular(Empleado empleado);

    protected abstract void imprimir(Empleado empleado, int sueldo);

    protected void depositar (Empleado empleado, int sueldo){
        if(sueldo != -1){
            System.out.println("sueldo depositado en la cuenta: "+empleado.getCuenta());
        }
    }
}
