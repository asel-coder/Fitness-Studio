import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
    public static void main(String[] args) {

        String url =
                "jdbc:sqlserver://localhost:1433;" +
                        "databaseName=fitness_studio_db;" +
                        "encrypt=true;" +
                        "trustServerCertificate=true";

        String user = "gym_user";
        String password = "GymPass123";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("CONNECTED to SQL Server successfully!");
        } catch (SQLException e) {
            System.out.println("Connection FAILED");
            e.printStackTrace();
        }
    }
}
