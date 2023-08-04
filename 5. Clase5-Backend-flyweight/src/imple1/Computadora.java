package imple1;

public class Computadora {
    private TipoComputadoraEnum id;
    private int ram;
    private int discoDuro;
    private int contador;

    public Computadora(TipoComputadoraEnum id, int ram, int discoDuro, int contador) {
        this.id = id;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.contador = contador;
    }

    public Computadora() {
    }

    public void incrementarContador(){
        contador ++;
    }

    public TipoComputadoraEnum getId() {
        return id;
    }

    public void setId(TipoComputadoraEnum id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
