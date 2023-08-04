package service.impl;

import modelos.Mail;
import service.CompruebaMail;

public class Comercial extends CompruebaMail {
    public Comercial(CompruebaMail siguiente) {
        super(siguiente);
    }

    public Comercial() {
        super();
    }

    @Override
    public String procesar(Mail mail) {
        if(mail.getDestino().equals("comercial@colmena.com")){
            System.out.println("El departamento Comercial ha procesado el mail "+mail.getTema());
            return "COMERCIAL";
        }else if(this.getSiguiente() != null){
            return this.getSiguiente().procesar(mail);
        }
        System.out.println("No se pudo procesar el mail " +mail.getTema() + " ha sido marcado como spam");
        return "SPAM";
    }
}
