package service;

import model.Producto;
import model.Tarjeta;

public interface IFacade {
    public abstract int calcularDescuento(Producto producto, Tarjeta tarjeta, int cantidad);
}
