import java.util.Scanner;
import java.util.*;

public class SommaApprossimata {

    // Metodo per sommare due numeri
    public static double somma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        double numero1 = 5.5;
        double numero2 = 10.8;

        // Calcola la somma
        double risultato = somma(numero1, numero2);
        int risultatoint = (int) Math.round(risultato);

        // Stampa il risultato della somma
        System.out.println("La somma di " + numero1 + " e " + numero2 + " è: " + risultato + "\nquello troncato e':" + risultatoint);
    }
}
