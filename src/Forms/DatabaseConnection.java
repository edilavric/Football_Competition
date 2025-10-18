/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

/**
 *
 * @author lavri
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    private static final String URL ="jdbc:mysql://localhost:3306/campionat";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexiune realizata cu succes la baza de date 'campionat'");
        } catch (SQLException e) {
            System.out.println("Eroare la conectarea bazei de date:");
            e.printStackTrace();
        }
        return conn;
    }
}
