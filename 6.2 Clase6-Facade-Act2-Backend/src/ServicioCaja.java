public class ServicioCaja {
    public String entregarDinero(int montoRetiro, Cuenta cuenta) {
        if (montoRetiro <= cuenta.getSaldoCuenta()) {
            System.out.println("su saldo actual es de: " + cuenta.getSaldoCuenta() + " y desea retirar: " + montoRetiro);
            int saldoFinal = cuenta.getSaldoCuenta() - montoRetiro;
            cuenta.setSaldoCuenta(saldoFinal);
            System.out.println("Se aprueba el retiro y su nuevo saldo es de: " + cuenta.getSaldoCuenta());
            return "RETIRO APROBADO";
        }
        System.out.println("no es posible autorizar el retiro, su saldo es inferior al monto a retirar");
        return "RETIRO NO APROBADO";


    }
}
