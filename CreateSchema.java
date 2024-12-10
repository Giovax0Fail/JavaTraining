import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateSchema {
    static final String DB_URL = "jdbc:mysql://localhost/dbnew"; // Modifica con il nome del tuo database
    static final String USER = "root"; // Sostituisci con il tuo username
    static final String PASS = ""; // Sostituisci con la tua password (se presente)

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();) {
            String sql = "CREATE SCHEMA IF NOT EXISTS SchemaEx";
            stmt.executeUpdate(sql);
            System.out.println("Schema created successfully...");
        } catch (SQLException e) {
            System.err.println("Errore durante la creazione dello schema: " + e.getMessage());
            e.printStackTrace();
        }
    }
}