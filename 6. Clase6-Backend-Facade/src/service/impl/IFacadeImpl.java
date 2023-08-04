package service.impl;

import model.Producto;
import model.Tarjeta;
import service.IFacade;
import service.api.ApiCantidad;
import service.api.ApiProducto;
import service.api.ApiTarjeta;

public class IFacadeImpl implements IFacade {

    private ApiCantidad apiCantidad;
    private ApiTarjeta apiTarjeta;
    private ApiProducto apiProducto;

    public IFacadeImpl(){
        apiCantidad = new ApiCantidad();
        apiProducto = new ApiProducto();
        apiTarjeta = new ApiTarjeta();
    }
    @Override
    public int calcularDescuento(Producto producto, Tarjeta tarjeta, int cantidad) {

        int descuento = 0;

        descuento += apiCantidad.descuento(cantidad);
        descuento += apiProducto.descuento(producto);
        descuento += apiTarjeta.descuento(tarjeta);


        return descuento;
    }
}
