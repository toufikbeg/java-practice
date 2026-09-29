public class GenerateSQL {
    public static void main(String[] args) {
        try {
            java.sql.Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/missingdb", "root", "wrongpass");
            connection.close();
        } catch (java.sql.SQLException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
