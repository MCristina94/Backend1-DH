package service;

import modelos.Mail;

public abstract class CompruebaMail {
    private CompruebaMail siguiente;

    public CompruebaMail() {
    }

    public CompruebaMail(CompruebaMail siguiente) {
        this.siguiente = siguiente;
    }
    public abstract String procesar(Mail mail);

    public CompruebaMail getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CompruebaMail siguiente) {
        this.siguiente = siguiente;
    }
}
