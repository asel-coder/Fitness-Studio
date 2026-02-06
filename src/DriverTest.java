public class DriverTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("SQL Server JDBC driver FOUND");
        } catch (ClassNotFoundException e) {
            System.out.println("SQL Server JDBC driver NOT found");
            e.printStackTrace();
        }
    }
}
