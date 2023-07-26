package empleado;

import menu.Menu;
import menu.MenuInfantil;
import menu.MenuVegetariano;

public class EmpleadoArmadorInfantil extends EmpleadoArmador{
    @Override
    protected void armandoMenu(Menu menu, double precio) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        System.out.println("Armando menú infantil con: " + menuInfantil.getCantJuguetes() + " juguetes y el precio es: " + precio);
    }

    @Override
    protected double calculoPrecioVenta(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        return menu.getPrecioBase() + (3 * menuInfantil.getCantJuguetes());
    }
}
