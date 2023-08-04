import org.apache.log4j.Logger;

import java.util.List;

public class Calculadora {
    private static final Logger LOGGER = Logger.getLogger(Calculadora.class);
    public double calcularPromedio(List<Integer> numeros){

        Integer suma = 0;
        double totalPromedio = 0;
        for(int i = 0; i<numeros.size(); i++){
            suma += numeros.get(i);
        }
        totalPromedio = (double)suma / numeros.size();
        LOGGER.info("se esta calculando el promedio de la lista de numeros, el resultado es: "+totalPromedio);
         return totalPromedio;

        }

    public void tamanioLista(List<Integer> numeros){

        if(numeros.size()<5 && numeros.size()>0) {
            LOGGER.info("Esta lista tiene menos de 5 elementos, tiene: " + numeros.size() + " elementos");
        }else if(numeros.size() >5 && numeros.size() <=10){
            LOGGER.info("Esta lista tiene mas de 5 elementos");
        }else if(numeros.size()>10){
            LOGGER.info("Esta lista tiene mas de 10 elementos");
        //}else if(numeros.isEmpty()){
            //LOGGER.error("Esta lista se encuentra vacia");

        }

        }

        public void listaVacia(List<Integer> numeros) throws Exception{
            if(numeros.isEmpty() || numeros.size()==0 || numeros == null)  throw new Exception("La lista es igual a cero");

        }

    }



