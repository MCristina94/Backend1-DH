public class SQLQueries {
    public static final String CREATETABLES =
            "DROP TABLE IF EXISTS ANIMALES;" +
            "CREATE TABLE ANIMALES(ID INT PRIMARY KEY, NOMBRE VARCHAR(255), TIPO VARCHAR(255));" ;

    public static final String INSERT = "INSERT INTO ANIMALES VALUES(1,'Firulais','PERRO');";

    public static final String INSERT_CUSTOM = "INSERT INTO ANIMALES VALUES(?,?,?);";

    public static final String TRAER_ANIMALES = "SELECT * FROM ANIMALES";

    public static final String DELETE_CUSTOM = "DELETE FROM ANIMALES WHERE ID = ?;";

    public static final String UPDATE_CUSTOM = "UPDATE ANIMALES SET NOMBRE = ? , TIPO = ? WHERE ID = ?;";
}
