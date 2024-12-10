import java.sql.*;

// This class demonstrates use of selecting a database.
public class AllRecords {
    static final String DB_URL = "jdbc:mysql://localhost/dbnew"; // Modifica con il tuo DB e nome corretto
    static final String USER = "root"; // Sostituisci con il tuo username
    static final String PASS = ""; // Sostituisci con la tua password (se presente)

    public static void main(String[] args) {

        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
            System.out.println("Connected database successfully...");
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery("SHOW DATABASES");
            System.out.println("DATABASES");
            System.out.println("-------------------------------------------");
            while (rs1.next()) {
                System.out.println(rs1.getString(1));
            }

            System.out.println("-------------------------------------------------------");
            // The line below SELECTS a database TUTORIALSPOINT
            stmt.executeUpdate("use dbnew");
            ResultSet rs2 = stmt.executeQuery("select * from utenti");
            System.out.println("Mostro Id e nomi di utenti");
            while (rs2.next()) {
                // Ottieni l'ID
                int id = rs2.getInt("id");

                // Ottieni il nome (assumendo che il campo si chiami 'nome')
                String nome = rs2.getString("nome");

                // Stampa l'ID e il nome
                System.out.println("id= " + id + ", nome= " + nome);
            }
            System.out.println("---------------------------------------------------");
            ResultSet rs3 = stmt.executeQuery("SHOW TABLES");
            System.out.println("Lista di tabelle nel DB:");
            System.out.println("---------------------------------------------------");

            while (rs3.next()) {

                System.out.println(rs3.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}