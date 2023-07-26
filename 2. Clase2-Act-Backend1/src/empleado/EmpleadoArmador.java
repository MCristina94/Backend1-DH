package empleado;

import menu.Menu;
import menu.MenuInfantil;
import menu.MenuVegetariano;

public abstract class EmpleadoArmador {

    public void ordenMenu(Menu menu){
        double precio = calculoPrecioVenta(menu);
        armandoMenu(menu, precio);
    }
    protected abstract void armandoMenu(Menu menu, double precio);

    protected abstract double calculoPrecioVenta(Menu menu);


}
