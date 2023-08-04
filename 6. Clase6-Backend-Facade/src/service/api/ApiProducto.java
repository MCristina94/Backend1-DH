package service.api;

import model.Producto;

public class ApiProducto {
    public int descuento(Producto producto){
        if(producto.getTipo().equals("Lata")){
            return 10;
        }else{
            return 0;
        }
    }
}
