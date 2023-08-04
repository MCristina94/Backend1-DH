package service.impl;

import modelos.Mail;
import service.CompruebaMail;

public class Gerencia extends CompruebaMail {



    public Gerencia(CompruebaMail siguiente) {
        super(siguiente);
    }

    public Gerencia() {
        super();

    }

    @Override
    public String procesar(Mail mail) {
        if(mail.getDestino().equals("gerencia@colmena.com")){
            System.out.println("El departamento gerencia ha procesado el mail "+mail.getTema());
            return "GERENCIA";
        }else if(this.getSiguiente() != null){
            return this.getSiguiente().procesar(mail);
        }
        System.out.println("No se pudo procesar el mail " +mail.getTema() + " ha sido marcado como spam");
        return "SPAM";
    }
}
