import java.time.Instant;
import java.util.Date;

public class Proxy implements ICentroVacunacion{
    private CentroVacunacion centroVacunacion;

    public Proxy(CentroVacunacion centroVacunacion) {
    }

    public CentroVacunacion getCentroVacunacion() {
        return centroVacunacion;
    }

    public void setCentroVacunacion(CentroVacunacion centroVacunacion) {
        this.centroVacunacion = centroVacunacion;
    }

    @Override
    public String vacunar(Persona persona) {
        Instant now = Instant.now();
        Date fechaActual = Date.from(now);
        if(!fechaActual.before(persona.getFechaVacinacion())){
            return centroVacunacion.vacunar(persona);
        }
        System.out.println("No se puede vacunar a " + persona);
        return "NO VACUNADO";
    }
}
