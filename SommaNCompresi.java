import java.util.Scanner;

public class SommaNCompresi {
    public static void main(String[] args) {
        int n1,n2,i,somma =0;

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInserisci il numero 1  ");
        n1= scanner.nextInt();

        
        System.out.println("\nInserisci il numero2 ");
        n2 = scanner.nextInt();

        for(i=n1;i<=n2;i++){
            somma=somma+i;
        }

        System.out.println("La somma di tutti i numeri compresi nell'intervallo " + n1 + ".." + n2 + " è: " + somma);


        
        
        
        
        scanner.close();
    }
}

