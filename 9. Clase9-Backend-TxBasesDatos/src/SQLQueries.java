public class SQLQueries {
    public static final String CREATETABLES =
            "DROP TABLE IF EXISTS CUENTAS;" +
            "CREATE TABLE CUENTAS(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), SALDO INT);" ;


    public static final String INSERT_CUSTOM = "INSERT INTO CUENTAS VALUES(?,?,?);";

    public static final String TRAER_CUENTAS = "SELECT * FROM CUENTAS";

    public static final String DELETE_CUSTOM = "DELETE FROM CUENTAS WHERE ID = ?;";

    public static final String UPDATE_CUSTOM = "UPDATE CUENTAS SET NOMBRE = ? , SALDO = ? WHERE ID = ?;";
}
