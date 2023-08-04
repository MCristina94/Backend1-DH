public class Arbol {
    private int alto;
    private int ancho;
    private String color;
    private TipoArbolEnum tipo;

    public Arbol() {
    }

    public Arbol(int alto, int ancho, String color, TipoArbolEnum tipo) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.tipo = tipo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoArbolEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoArbolEnum tipo) {
        this.tipo = tipo;
    }
}
