import model.Tarjeta;
import model.TarjetaCredito;
import model.TarjetaDebito;
import service.ProcesadorTarjeta;
import service.ProcesadorTarjetaDebito;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjetaDebito = new TarjetaDebito(1233554,123, "2022-12-05", 220000);
        Tarjeta tarjetaCredito = new TarjetaCredito(141414, 565, "2025-03-01", 10000, 1000);

        ProcesadorTarjeta procesadorTarjetaDebito = new ProcesadorTarjetaDebito();
        procesadorTarjetaDebito.procesarAutorizacion(tarjetaDebito, 100000000);



    }
}