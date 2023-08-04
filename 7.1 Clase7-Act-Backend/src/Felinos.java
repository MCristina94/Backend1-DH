public abstract  class Felinos {
    private String nombre;
    private int edad;

    public Felinos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void correr();

    public abstract boolean esMayorA10();
    public abstract void edadNegativa()throws Exception;

}
