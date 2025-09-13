package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase responsable de devolver conexiones JDBC a la BD 'universidad'.
 */
public class ConexionDB {

    // URL de conexión — ajusta host/puerto/nombreBD si hace falta
    private static final String URL =
            "jdbc:mysql://localhost:3306/universidad?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";

    // Cambia por tu usuario y contraseña de MySQL
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    // Cargar driver (no siempre necesario con JDBC4+, pero aclara el intent)
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC no encontrado. ¿Agregaste el .jar en lib y lo añadiste como Library?");
            e.printStackTrace();
        }
    }

    // Devuelve una Connection; el que llame debe manejar/close la conexión
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
