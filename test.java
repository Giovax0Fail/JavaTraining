import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner tastiera = new  Scanner(System.in);
        System.out.println("Inserisci la stringa");
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        String inputUtente = input.nextLine(); 
        int nstringa= inputUtente.length();
        System.out.println("\n Il numero di caratteri della stringa è :" + "\n" + nstringa );
        int a,b;
        System.out.println("\n Inserisci il primo valore per la sottostringa:  \n ");
        a = input.nextInt();
        System.out.println("\n Inserisci il secondo valore per la sottostringa:  \n ");
        b = input.nextInt();
        if (a < b && a >= 0 && b < inputUtente.length()) {
            System.out.println("\n Le posizioni sono valide.");
            String sub = inputUtente.substring(a, b);
            System.out.println("\n La sottostringa è: " + sub);
        } else {
            System.out.println("\n Le posizioni inserite non sono valide.");
        }
        
        tastiera.close();
    }
}