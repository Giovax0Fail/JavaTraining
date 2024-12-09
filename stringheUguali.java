import java.util.Scanner;

public class stringheUguali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = "";
        String input2 = "";

        System.out.println("\n" +"Inserisci la prima stringa" + "\n");
        input1= scanner.nextLine().toLowerCase(); 

        System.out.println("\n" + "Inserisci la seconda stringa" + "\n");
        input2 = scanner.nextLine().toLowerCase(); 

        boolean uguali = input1.equals(input2);
        if (uguali) {
            System.out.println("\n" + "Le due stringhe sono uguali" + "\n" );
        } else {
            System.out.println("\n" + "Le due stringhe sono diverse" + "\n" );
        }

        scanner.close(); 
    }
}