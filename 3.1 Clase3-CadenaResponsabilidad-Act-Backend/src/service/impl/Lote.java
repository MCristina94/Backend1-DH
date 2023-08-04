package service.impl;

import model.Articulo;
import service.AnalistaCalidad;

public class Lote extends AnalistaCalidad {

    public Lote() {
    }

    public Lote(AnalistaCalidad siguiente) {
        super(siguiente);
    }

    @Override
    public String validarCalidadDelProducto(Articulo articulo) {
        if(articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            System.out.println("El analisis de calidad del Lote fue aprobado");
            this.getSiguiente().validarCalidadDelProducto(articulo);
            return "LOTE APROBADO";

        }
        this.getSiguiente().validarCalidadDelProducto(articulo);
        System.out.println("El analisis de calidad del lote NO fue aprobado");
        return "LOTE NO APROBADO";
    }
}
