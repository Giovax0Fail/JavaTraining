import java.sql.*;

public class MySQLConnection {

    // Definizione delle costanti per la connessione al database
    static final String DB_URL = "jdbc:mysql://localhost/dbnew"; // Modifica con il tuo DB e nome corretto
    static final String USER = "root"; // Sostituisci con il tuo username
    static final String PASS = ""; // Sostituisci con la tua password (se presente)

    public static void main(String[] args) {
        // Array di nomi da inserire nel database
        String[] nomi = { "Mario Rossi", "Lucia Bianchi", "Giovanni Verdi" };
        String insertQuery = "INSERT INTO utenti (Nome) VALUES (?)"; // Query parametrizzata

        // Connessione e inserimento dati
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

            for (String nome : nomi) {
                stmt.setString(1, nome); // Impostiamo il nome per l'inserimento
                stmt.executeUpdate(); // Eseguiamo l'inserimento
                System.out.println("Nome inserito: " + nome); // Conferma per ogni nome inserito
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Se c'è un errore, lo stampiamo
        }
    }
}
