package empleado;

import menu.Menu;
import menu.MenuInfantil;
import menu.MenuVegetariano;

public class EmpleadoArmandorClasico extends EmpleadoArmador {


    @Override
    protected void armandoMenu(Menu menu, double precio) {
        System.out.println("preparando menú clasico, y el precio es: " + precio);
    }

    @Override
    protected double calculoPrecioVenta(Menu menu) {
        return menu.getPrecioBase();
    }
}
