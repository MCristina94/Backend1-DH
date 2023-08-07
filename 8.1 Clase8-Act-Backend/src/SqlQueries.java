public class SqlQueries {
    public static final String CREATETABLES =
            "DROP TABLE IF EXISTS FIGURAS;"+
             "CREATE TABLE FIGURAS(ID INT PRIMARY KEY, TIPOFIGURA VARCHAR(255), COLOR VARCHAR(255));" ;

    public static final String INSERT_CUSTOM = "INSERT INTO FIGURAS VALUES(?,?,?);";
    public static final String TRAER_FIGURAS = "SELECT * FROM FIGURAS;";

}
