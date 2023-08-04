import modelos.Mail;
import service.CompruebaMail;
import service.impl.Comercial;
import service.impl.Gerencia;
import service.impl.Tecnico;

public class ProcesaMail {
    private CompruebaMail compruebaMail;

    public ProcesaMail() {
        CompruebaMail impl1 = new Comercial();
        CompruebaMail impl2 = new Gerencia();
        CompruebaMail impl3 = new Tecnico();

        impl1.setSiguiente(impl2);
        impl2.setSiguiente(impl3);
        impl3.setSiguiente(null);

        compruebaMail = impl1;
    }
    public String mandarMail (String origen, String destino, String tema){
        Mail mail = new Mail(origen, destino, tema);

        return compruebaMail.procesar(mail);
    }

    public CompruebaMail getCompruebaMail() {
        return compruebaMail;
    }

    public void setCompruebaMail(CompruebaMail compruebaMail) {
        this.compruebaMail = compruebaMail;
    }
}
