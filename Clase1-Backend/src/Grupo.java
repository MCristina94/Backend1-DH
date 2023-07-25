import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> lista;

    public Grupo() {
        lista = new ArrayList<>();
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

    public void agregarPersona(Persona persona){
        if(persona.getEdad()>=18 && persona.getNombre().length()>3){
            lista.add(persona);
        }
        else{
            System.out.println("La persona"+ persona.getNombre()+"no cumple los requisitos");
        }
    }
}
