import java.sql.*;

public class MySQLConnection {

    // Definizione delle costanti per la connessione al database
    static final String DB_URL = "jdbc:mysql://localhost/dbnew"; // Modifica con il tuo DB e nome corretto
    static final String USER = "root"; // Sostituisci con il tuo username
    static final String PASS = ""; // Sostituisci con la tua password (se presente)

    public static void main(String[] args) {
        // Query per inserire un nuovo record
        String insertQuery = "INSERT INTO utenti (Nome) VALUES (?)"; // Modifica con il nome della tua tabella e
                                                                     // colonne

        // Connessione e inserimento dati
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

                PreparedStatement stmt = conn.prepareStatement(insertQuery);) {

            // Impostiamo i parametri per l'inserimento
            stmt.setString(1, "Mario Rossi"); // Qui inseriamo il valore che vogliamo

            // Eseguiamo la query di inserimento
            int rowsAffected = stmt.executeUpdate();
            System.out.println("Numero di righe inserite: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
