public class SQLQueries {

    public static final String CREATETABLES=
            "DROP TABLE IF EXISTS PACIENTES;"+
            "CREATE TABLE PACIENTES(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), APELLIDO VARCHAR(255),DOMICILIO VARCHAR(255),DNI INT, FECHAALTA VARCHAR(255), USUARIO VARCHAR(255), PASSWORD VARCHAR(255));";
    public static final String INSERT=
            "INSERT INTO PACIENTES VALUES(?,?,?,?,?,?,?,?);";
    public static final String UPDATE =
            "UPDATE PACIENTES SET PASSWORD = ? WHERE USUARIO = ?;";
    public static final String TRAERPACIENTES=
            "SELECT * FROM PACIENTES";


}
