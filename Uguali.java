import java.util.Scanner;

public class Uguali {
    public static void main(String[] args) {
        int a,b =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +"Inserisci il numero 1" + "\n");
        a = scanner.nextInt();
        System.out.println("\n" +"Inserisci il numero 2" + "\n");
        b = scanner.nextInt();

        if(a==b){
            System.out.println("\n" + "numeri uguali" + "\n");
        }
        else{
            System.out.println("\n" + "numeri non uguali" + "\n");
        }

    }
}
