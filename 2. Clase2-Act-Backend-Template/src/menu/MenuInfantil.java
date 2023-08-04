package menu;

public class MenuInfantil extends Menu{
    private int cantJuguetes;

    public MenuInfantil(double precioBase, int cantJuguetes) {
        super(precioBase);
        this.cantJuguetes = cantJuguetes;
    }

    public int getCantJuguetes() {
        return cantJuguetes;
    }

    public void setCantJuguetes(int cantJuguetes) {
        this.cantJuguetes = cantJuguetes;
    }
}
