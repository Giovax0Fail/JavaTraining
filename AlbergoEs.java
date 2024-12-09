import java.util.Scanner;

public class AlbergoEs {
    public static void main(String[] args) {
        int piano1 = 35, piano2 = 45, piano3 = 55, piano4 = 65;
        int ngiorni, npiano, spesa = 0;

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInserisci il numero di soggiorni (giorni): ");
        ngiorni = scanner.nextInt();

        
        System.out.println("\nInserisci il piano della camera (1, 2, 3, 4): ");
        npiano = scanner.nextInt();

        
        switch (npiano) {
            case 1:
                spesa = piano1 * ngiorni;
                break;
            case 2:
                spesa = piano2 * ngiorni;
                break;
            case 3:
                spesa = piano3 * ngiorni;
                break;
            case 4:
                spesa = piano4 * ngiorni;
                break;
            default:
                System.out.println("Piano non valido! Scegli tra 1, 2, 3 o 4.");
                return; 
        }

        // Mostra la spesa totale
        System.out.println("La spesa per " + ngiorni + " giorni al piano " + npiano + " è di " + spesa + " Euro.");

        
        
        scanner.close();
    }
}
