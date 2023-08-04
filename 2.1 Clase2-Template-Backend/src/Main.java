import model.Empleado;
import model.EmpleadoContratado;
import model.EmpleadoEfectivo;
import service.LiquidadoraSueldo;
import service.LiquidarSuieldoContratado;
import service.LiquidadoraSueldoEfectivo;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoEfectivo("Tomás","Dozo", "AB123456789", 400, 40,60);
        Empleado empleado2 = new EmpleadoContratado("Jaime","Dozo", "AB123456789",7,120);

        LiquidadoraSueldo liquidadoraEfectivo = new LiquidadoraSueldoEfectivo();
        LiquidadoraSueldo liquidadoraContratado = new LiquidarSuieldoContratado();

        liquidadoraEfectivo.liquidarSueldo(empleado1);
        liquidadoraContratado.liquidarSueldo(empleado2);
        liquidadoraContratado.liquidarSueldo(empleado1);
    }
}