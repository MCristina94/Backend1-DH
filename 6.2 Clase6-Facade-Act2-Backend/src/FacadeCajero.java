public class FacadeCajero implements IFacadeCajero{
    private ServicioAutenticacion servicioAutenticacion;
    private ServicioCuenta servicioCuenta;
    private ServicioCaja servicioCaja;


    public FacadeCajero() {
        servicioAutenticacion = new ServicioAutenticacion();
        servicioCaja = new ServicioCaja();
        servicioCuenta = new ServicioCuenta();
    }


    @Override
    public String retirarDinero(Cuenta cuenta, int montoRetiro, String dni, String contrasenia) {
        String resultado = servicioAutenticacion.validarUsuarioYContrasenia(dni, contrasenia, cuenta) + " " +servicioCaja.entregarDinero(montoRetiro, cuenta);
        System.out.println(resultado);
        return "PROCESO FINALIZADO";
    }
}
