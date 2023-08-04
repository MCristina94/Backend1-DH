package service.api;

import model.Tarjeta;

public class ApiTarjeta {
    public int descuento (Tarjeta tarjeta){
        if(tarjeta.getBanco().equals("Star Bank")){
            return 20;
        }else{
            return 0;
        }
    }
}
