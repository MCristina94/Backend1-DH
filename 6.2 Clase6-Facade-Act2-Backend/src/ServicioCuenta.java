import org.w3c.dom.ls.LSOutput;

public class ServicioCuenta {
    public String getCuenta (String dni){

            String datosCuenta = "el dni del usuario es: " + dni;
            System.out.println(datosCuenta);
            return "DATOS BRINDADOS";
    }
}
