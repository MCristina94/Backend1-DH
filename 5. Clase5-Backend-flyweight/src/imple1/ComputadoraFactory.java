package imple1;

import java.util.HashMap;

public class ComputadoraFactory {
    private static HashMap<TipoComputadoraEnum, Computadora> map = new HashMap<>();

    public static Computadora getComputadora(TipoComputadoraEnum tipo){
        Computadora computadora;
        if(tipo == null){
            System.out.println("tipo no existente");
            return null;
        }
        computadora = map.get(tipo);

             if(computadora == null){ //No estaba instanciada, hay que crearla
                computadora = new Computadora(tipo, tipo.getRamPorDefecto(), tipo.getDiscoDuroDefecto(), 1);
                map.put(tipo, computadora);
                 System.out.println("se creo una instancia de tipo "+tipo);

         }else{
             computadora.incrementarContador();
         }
        return computadora;
    }



}


//usando un string y no un Enum
/*
    private static HashMap<String, Computadora> map = new HashMap<>();

    public static Computadora getComputadora(String tipo){
        Computadora computadora;
        computadora = map.get(tipo);
        if(computadora == null){ //No estaba instanciada, hay que crearla



            if(tipo.equals("windows")){
                //asigno ram y disco
                computadora = new Computadora("windows", 2, 128, 1);
                System.out.println("se creo una instancia de windows");
                map.put("windows", computadora);
            }else if(tipo.equals("mac")){
                //asigno ram y disco
                computadora = new Computadora("mac", 16, 500, 1);
                System.out.println("Se creo una instancia de mac");
                map.put("mac", computadora);
            }else{
                System.out.println("No se pudo obtener una instancia, tipo no valido");
            }
        }else{
            computadora.incrementarContador();
        }
        return computadora;
    }*/