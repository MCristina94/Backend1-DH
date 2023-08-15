package org.digitalhouse.Utils;

public class SQLQueries {
    public static final String CREATETABLES =
            "DROP TABLE IF EXISTS MEDICAMENTOS;" +
            "CREATE TABLE MEDICAMENTOS(ID INT PRIMARY KEY, CODIGO INT, PRECIO DECIMAL(10,2), CANTIDAD INT, LABORATORIO VARCHAR(255));" ;


    public static final String INSERT_CUSTOM = "INSERT INTO MEDICAMENTOS VALUES(?,?,?,?,?);";

    public static final String TRAER_MEDICAMENTO = "SELECT * FROM MEDICAMENTOS WHERE ID = ?";
    public static final String TRAER_MEDICAMENTO_PRECIO = "SELECT * FROM MEDICAMENTOS WHERE PRECIO = ?";


}
