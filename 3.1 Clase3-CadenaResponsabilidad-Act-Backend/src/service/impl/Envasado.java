package service.impl;

import model.Articulo;
import service.AnalistaCalidad;

public class Envasado extends AnalistaCalidad {

    public Envasado() {
    }

    public Envasado(AnalistaCalidad siguiente) {
        super(siguiente);
    }

    @Override
    public String validarCalidadDelProducto(Articulo articulo) {
        if(articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")){
            System.out.println("El analisis de calidad del envasado fue aprobado");
            return "ENVASADO APROBADO";
        }

        System.out.println("El analisis de calidad del envasado NO fue aprobado");
        return "ENVASADO NO APROBADO";
    }
}
