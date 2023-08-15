package Utils;

public class SQLQueries {

    public static final String CREATETABLES =
            "DROP TABLE IF EXISTS ODONTOLOGOS;" +
                    "CREATE TABLE ODONTOLOGOS (ID INT PRIMARY KEY, NUMERO_MATRICULA INT, NOMBRE VARCHAR(255), APELLIDO VARCHAR(255));";

    public static final String INSERT_CUSTOM =
            "INSERT INTO ODONTOLOGOS VALUES(?,?,?,?);";

    public static final String TRAER_ODONTOLOGOS =
            "SELECT * FROM ODONTOLOGOS;";


}
