import java.sql.SQLOutput;
import java.util.HashMap;


public class ArbolFactory {
    private static HashMap<TipoArbolEnum, Arbol> map = new HashMap<>();

    public static Arbol getArbol(TipoArbolEnum tipo) {
        Arbol arbol;
        if(tipo == null){
            System.out.println("No ingreso tipo");
        }
            arbol = map.get(tipo);
            if(arbol == null){
                arbol = new Arbol(tipo.getAltoDefecto(),tipo.getAnchoDefecto(), tipo.getColorDefecto(),tipo);
                map.put(tipo, arbol);
                System.out.println("se creo una instancia tipo "+tipo);

        }
            return arbol;
    }
}
