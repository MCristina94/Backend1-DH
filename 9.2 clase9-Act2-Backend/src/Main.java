import org.apache.log4j.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        try{
            SQL.iniciarConexion();
        }catch (Exception e){
            LOGGER.error("No se estableció la conexión ", e);
            return;
        }

        Paciente paciente1 = new Paciente(1, "Manuela", "Ortiz", "Calle23", 123456, "2021-05-26", "Manuela123", "101010");
        Paciente paciente2 = new Paciente(2, "Ana Lucia", "Mandela", "Carrera81", 789101112, "2022-04-30", "Ana1045", "556655");

        SQL.crearPaciente(paciente1);
        SQL.crearPaciente(paciente2);
        SQL.traerPacientes();
        SQL.cambiarPassword(paciente1, "ñañaña");
        SQL.traerPacientes();

    }
}