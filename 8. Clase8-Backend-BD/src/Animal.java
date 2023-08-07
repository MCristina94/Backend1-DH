public class Animal {
    private String tipo;
    private String nombre;
    private int id;

    public Animal(String tipo, String nombre, int id) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.id = id;
    }

    public Animal() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
