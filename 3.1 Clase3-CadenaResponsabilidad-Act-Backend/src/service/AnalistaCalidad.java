package service;

import model.Articulo;

public abstract class AnalistaCalidad {
    private AnalistaCalidad siguiente;

    public AnalistaCalidad() {
    }

    public AnalistaCalidad(AnalistaCalidad siguiente) {
        this.siguiente = siguiente;
    }

    public AnalistaCalidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(AnalistaCalidad siguiente) {
        this.siguiente = siguiente;
    }

    public abstract String validarCalidadDelProducto(Articulo articulo);
}
