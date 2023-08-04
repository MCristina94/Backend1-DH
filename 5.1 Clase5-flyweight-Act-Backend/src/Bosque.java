import java.util.ArrayList;
import java.util.List;

public class Bosque {
    public Bosque() {
    }

    public void plantarArboles(){
        for (int i = 0; i < 500000; i++){

            System.out.println(ArbolFactory.getArbol(TipoArbolEnum.ORNAMENTALES).getColor());

        }
        for (int i = 0; i < 500000; i++){
            System.out.println(ArbolFactory.getArbol(TipoArbolEnum.FRUTALES).getColor());
        }
    }

}
