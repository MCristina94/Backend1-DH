import empleado.EmpleadoArmadorInfantil;
import empleado.EmpleadoArmandorClasico;
import empleado.EmpleadoArmadorVegetariano;
import empleado.EmpleadoArmador;
import menu.MenuVegetariano;
import menu.MenuInfantil;
import menu.Menu;
import menu.MenuClasico;

public class Main {
    public static void main(String[] args) {
        Menu menu1 = new MenuClasico(15000.0);
        Menu menu2 = new MenuVegetariano(15000.0, 3, 2);
        Menu menu3 = new MenuInfantil(15000.0, 1);

        EmpleadoArmador armandoMenuClasico = new EmpleadoArmandorClasico();
        EmpleadoArmador armandoMenuInfantil = new EmpleadoArmadorInfantil();
        EmpleadoArmador armandoMenuVegie = new EmpleadoArmadorVegetariano();

        armandoMenuInfantil.ordenMenu(menu3);
        armandoMenuClasico.ordenMenu(menu1);
        armandoMenuVegie.ordenMenu(menu2);


    }
}