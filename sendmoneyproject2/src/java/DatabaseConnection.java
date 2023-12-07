
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection getConnectin() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/bank";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "udaysql@350");

        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
}
