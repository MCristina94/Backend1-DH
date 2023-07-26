package menu;

public class MenuVegetariano extends Menu{
    private int cantSalsas;
    private int CantEspecias;

    public MenuVegetariano(double precioBase, int cantSalsas, int cantEspecias) {
        super(precioBase);
        this.cantSalsas = cantSalsas;
        CantEspecias = cantEspecias;
    }

    public int getCantSalsas() {
        return cantSalsas;
    }

    public int getCantEspecias() {
        return CantEspecias;
    }

    public void setCantSalsas(int cantSalsas) {
        this.cantSalsas = cantSalsas;
    }

    public void setCantEspecias(int cantEspecias) {
        CantEspecias = cantEspecias;
    }
}
