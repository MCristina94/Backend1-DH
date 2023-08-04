package empleado;

import menu.Menu;
import menu.MenuInfantil;
import menu.MenuVegetariano;

public class EmpleadoArmadorVegetariano extends EmpleadoArmador {
    @Override
    protected void armandoMenu(Menu menu, double precio) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
        System.out.println("Armando el menu vegetariano con: " + menuVegetariano.getCantEspecias() + " especias y " + menuVegetariano.getCantSalsas() + " salsas. y el precio es: " +precio);
    }

    @Override
    protected double calculoPrecioVenta(Menu menu) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
        return menu.getPrecioBase() + (2 * menuVegetariano.getCantSalsas()) + ((menu.getPrecioBase()*0.01) * menuVegetariano.getCantEspecias());
    }
}
