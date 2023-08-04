import org.apache.log4j.Logger;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Logger LOGGER = Logger.getLogger(Main.class);

        List<Integer> lista1 = List.of(2,3,5);
        List<Integer> lista2 = List.of(2,3,5,2,5,4);
        List<Integer> lista3 = List.of(2,3,5,4,7,8,9,6,2,5,4);
        List<Integer> lista4 = null;

        Calculadora calculadora = new Calculadora();
        //System.out.println(calculadora.calcularPromedio(lista2));

        //calculadora.tamanioLista(lista1);
        //calculadora.tamanioLista(lista2);

        try{
            calculadora.listaVacia(lista4);
        }catch(Exception e){
            LOGGER.error(e);
        }

    }
}