package service.impl;

import model.Producto;
import model.Tarjeta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.IFacade;

import static org.junit.jupiter.api.Assertions.*;

class IFacadeImplTest {
    @Test
    void calcularDescuento() {
        Producto producto1 = new Producto("Lata", "coca cola");
        Producto producto2 = new Producto("utiles", "lapicera boc");
        Tarjeta tarjeta1 = new Tarjeta("123456", "Star Bank");
        Tarjeta tarjeta2 = new Tarjeta("123456", "Banco Santander");
        int cantidad1 = 45;
        int cantidad2 = 5;

        IFacade facade = new IFacadeImpl();
        int descuento = 0;

        descuento = facade.calcularDescuento(producto1, tarjeta2, cantidad2);

        Assertions.assertEquals(0, descuento);
    }
}