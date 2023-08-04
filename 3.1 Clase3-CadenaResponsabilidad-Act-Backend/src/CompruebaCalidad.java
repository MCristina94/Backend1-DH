import model.Articulo;
import service.AnalistaCalidad;
import service.impl.Envasado;
import service.impl.Lote;
import service.impl.Peso;

public class CompruebaCalidad {

    private AnalistaCalidad analistaCalidad;

    public CompruebaCalidad(){
        AnalistaCalidad process1 = new Lote();
        AnalistaCalidad process2 = new Peso();
        AnalistaCalidad process3 = new Envasado();

        process1.setSiguiente(process2);
        process2.setSiguiente(process3);
       process3.setSiguiente(null);

        analistaCalidad = process1;
    }

    public String crearArticulo(String nombre, int lote, int peso, String envasado){
        Articulo articulo = new Articulo(nombre, lote, peso, envasado);
        return analistaCalidad.validarCalidadDelProducto(articulo);
    }

    public AnalistaCalidad getAnalistaCalidad() {
        return analistaCalidad;
    }

    public void setAnalistaCalidad(AnalistaCalidad analistaCalidad) {
        this.analistaCalidad = analistaCalidad;
    }
}
