package service.impl;

import modelos.Mail;
import service.CompruebaMail;

public class Tecnico extends CompruebaMail {


    public Tecnico(CompruebaMail siguiente) {
        super(siguiente);
    }

    public Tecnico() {
        super();
    }

    @Override
    public String procesar(Mail mail) {
        if(mail.getDestino().equals("tecnica@colmena.com")){
            System.out.println("El departamento Tecnica ha procesado el mail "+mail.getTema());
            return "TECNICA";
        }else if(this.getSiguiente() != null){
            return this.getSiguiente().procesar(mail);
        }
        System.out.println("No se pudo procesar el mail " +mail.getTema() + " ha sido marcado como spam");
        return "SPAM";
    }
}
