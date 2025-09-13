package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {


    private static final String URL =
            "jdbc:mysql://localhost:3306/universidad?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";


    private static final String USER = "root";
    private static final String PASSWORD = "1234";


    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("verifico si el jbdc esta conectado , en la lib");
            e.printStackTrace();
        }
    }


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
