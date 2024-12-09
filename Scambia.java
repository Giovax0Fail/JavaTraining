import java.util.Scanner;

public class Scambia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        int z; //variabile d'appoggio


        System.out.println("Inserisci il primo numero:");
        x = input.nextInt();
        System.out.println("Inserisci il secondo numero:");
        y = input.nextInt();
        z=x; //prendere variabile x e metterla in variabile d'appoggio
        x = y; //scambio x ed y
        y=z;//mi riprendo il valore iniziale di x prendendomelo da z




        System.out.println("Ecco i numeri inseriti in ordine inverso:");
        System.out.println(x);
        System.out.println(y);

        input.close();
    }
}
