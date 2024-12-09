import java.util.Scanner;

public class Sottostringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = "";
        String s = "";

        System.out.println("\n" +"Inserisci una frase" + "\n");
        f= scanner.nextLine().toLowerCase(); 

        System.out.println("\n" + "Inserisci una stringa" + "\n");
        s = scanner.nextLine().toLowerCase(); 

        if ( f.toLowerCase().indexOf(s.toLowerCase()) != -1 ) {

            System.out.println("\n" +"Ho trovato la parola nella frase");
         
         } else {
         
            System.out.println("\n" + "parola non trovata");
         
         }

         f = f.toUpperCase();
         System.out.println(f);
        
        scanner.close(); 
    }
}