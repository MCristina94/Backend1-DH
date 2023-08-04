public class CentroVacunacion implements ICentroVacunacion{
    @Override
    public String vacunar(Persona persona) {
        System.out.println("vacunamos a " + persona);
        return "VACUNADO";
    }
}
