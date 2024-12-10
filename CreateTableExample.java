import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {

    // Definizione delle costanti per la connessione al database
    static final String DB_URL = "jdbc:mysql://localhost/dbnew"; // Modifica con il nome del tuo database
    static final String USER = "root"; // Sostituisci con il tuo username
    static final String PASS = ""; // Sostituisci con la tua password (se presente)

    public static void main(String[] args) {
        // Connessione al database e creazione della tabella
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {

            // Query per creare una nuova tabella
            String sql = "CREATE TABLE IF NOT EXISTS dipendenti (" +
                    "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                    "Nome VARCHAR(100) NOT NULL, " +
                    "Email VARCHAR(100) NOT NULL" +
                    ");";

            // Eseguiamo la query per creare la tabella
            stmt.executeUpdate(sql);
            System.out.println("Tabella 'utenti' creata con successo...");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
