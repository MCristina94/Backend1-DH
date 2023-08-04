public class ServicioAutenticacion {


    public String validarUsuarioYContrasenia(String dni, String contrasenia, Cuenta cuenta){
    if(dni.equals(cuenta.getDni()) && contrasenia.equals(cuenta.getContrasenia())){
        System.out.println("Los datos de validación se encuentran aprobados");
        ServicioCuenta servicioCuenta = new ServicioCuenta();
        servicioCuenta.getCuenta(dni);
        return "APROBADO";

        //pendiente remitir a servicioCuuenta
    }
    System.out.println("los datos ingresados se encuentran incorrectos, no coinciden con la cuenta");
    return "NO APROBADO";
}


}
