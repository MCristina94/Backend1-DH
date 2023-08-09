package Utils;

public class SQLQueries {
    public static final String CREATETABLES =
            "DROP TABLE IF EXISTS AVIONES;" +
            "CREATE TABLE AVIONES (ID INT PRIMARY KEY, MARCA VARCHAR(255), MODELO VARCHAR(255), MATRICULA VARCHAR (255), FECHASERVICIO VARCHAR (255));";

    public static final String INSERT_CUSTOM =
            "INSERT INTO AVIONES VALUES(?,?,?,?,?);";
    public static final String TRAER_AVION =
            "SELECT * FROM AVIONES WHERE ID = ?;";
    public static final String TRAER_AVIONES =
            "SELECT * FROM AVIONES;";
    public static final String DELETE_CUSTOM =
            "DELETE FROM AVIONES WHERE ID = ?;";

}
