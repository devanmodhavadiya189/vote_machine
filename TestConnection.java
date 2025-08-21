import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/voting?useSSL=false", 
                "root", 
                "hello@123");
            System.out.println("SUCCESS: Connected to database!");
            conn.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}