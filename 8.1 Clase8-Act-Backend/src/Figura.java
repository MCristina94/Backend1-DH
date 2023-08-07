public class Figura {
    private String tipoFigura;
    private String color;
    private int id;

    public Figura(String tipoFigura, String color, int id) {
        this.tipoFigura = tipoFigura;
        this.color = color;
        this.id = id;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
