package service.impl;

import model.Articulo;
import service.AnalistaCalidad;

public class Peso extends AnalistaCalidad {

    public Peso() {
    }

    public Peso(AnalistaCalidad siguiente) {
        super(siguiente);
    }

    @Override
    public String validarCalidadDelProducto(Articulo articulo) {
        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            System.out.println("El analisis de calidad del peso fue aprobado");
            this.getSiguiente().validarCalidadDelProducto(articulo);
            return "PESO APROBADO";
        }
        this.getSiguiente().validarCalidadDelProducto(articulo);
        System.out.println("El analisis de calidad del peso NO fue aprobado");
        return "PESO NO APROBADO";
    }
}
