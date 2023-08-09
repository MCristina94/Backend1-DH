public class SQLQueries {
    public static final String CREATETABLES=
            "DROP TABLE IF EXISTS ODONTOLOGOS;"+
                    "CREATE TABLE ODONTOLOGOS(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), APELLIDO VARCHAR(255), MATRICULA VARCHAR(255));";
    static final String INSERT = "INSERT INTO ODONTOLOGOS VALUES(?,?,?,?);";
    static final String UPDATE = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE NOMBRE=?;";
    public static final String TRAER_ODONTOLOGOS = "SELECT * FROM ODONTOLOGOS";

}
