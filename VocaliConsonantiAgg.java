import java.util.Scanner;
import java.util.*;

public class VocaliConsonanti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeininput;
        String nomeininputLowercase;

        // Array che conterranno vocali e consonanti in output
        String[] arraydiconsonantiout = new String[10];
        int consonantiIndexout = 0;
        String[] arraydivocaliout = new String[10];
        int vocaliIndexout = 0;

        // Array di vocali e consonanti
        String vocali = "aeiou"; // Stringa le vocali
        String consonanti = "bcdfghjklmnpqrstvwxyz";// Stringa le consonanti

        System.out.println("\nInserisci un nome");
        nomeininput = input.nextLine();
        nomeininputLowercase = nomeininput.toLowerCase();


        for (int i = 0; i < nomeininputLowercase.length(); i++) {
            char carattereStringaInput = nomeininputLowercase.charAt(i);

            //verifica le consonanti
            if (vocali.indexOf(carattereStringaInput) >= 0) {
                if (vocaliIndexout < arraydivocaliout.length) {
                    arraydivocaliout[vocaliIndexout] = String.valueOf(carattereStringaInput);
                    vocaliIndexout++;
                }
            }
            // Se il carattere è una consonante
            else if (consonanti.indexOf(carattereStringaInput) >= 0) {
                if (consonantiIndexout < arraydiconsonantiout.length) {
                    arraydiconsonantiout[consonantiIndexout] = String.valueOf(carattereStringaInput);
                    consonantiIndexout++;
                }
            }
        }

        // Stampa consonanti
        System.out.println("\nLe consonanti trovate sono:\n");
        for (int i = 0; i < consonantiIndexout; i++) {
            System.out.print(arraydiconsonantiout[i]);
        }

        // Stampa vocali
        System.out.println("\nLe vocali trovate sono:\n");
        for (int i = 0; i < vocaliIndexout; i++) {
            System.out.print(arraydivocaliout[i]);
        }

        // Stampa consonanti ordinate
        System.out.println("\nLe consonanti riordinate:");
        Arrays.sort(arraydiconsonantiout, 0, consonantiIndexout);
        for (int i = 0; i < consonantiIndexout; i++) {
            System.out.print(arraydiconsonantiout[i]);
        }

        // Stampa vocali ordinate
        System.out.println("\nLe vocali riordinate:");
        Arrays.sort(arraydivocaliout, 0, vocaliIndexout);
        for (int i = 0; i < vocaliIndexout; i++) {
            System.out.print(arraydivocaliout[i]);
        }

        // Rimuovi duplicati consonanti con HashMap
        System.out.println("\nLe consonanti senza duplicati:");
        HashMap<Character, Integer> mapConsonanti = new HashMap<>();
        String consonantiSenzaDuplicati = "";
        for (int i = 0; i < consonantiIndexout; i++) {
            char c = arraydiconsonantiout[i].charAt(0);
            if (!mapConsonanti.containsKey(c)) {
                mapConsonanti.put(c, 1);
                consonantiSenzaDuplicati = consonantiSenzaDuplicati + c;
            }
        }
        System.out.println(consonantiSenzaDuplicati);

        // Rimuovi duplicati consonanti con HashMap
        System.out.println("\nLe vocali senza duplicati:");
        HashMap<Character, Integer> mapVocali = new HashMap<>();
        String vocaliSenzaDuplicati = "";
        for (int i = 0; i < vocaliIndexout; i++) {
            char c = arraydivocaliout[i].charAt(0);
            if (!mapVocali.containsKey(c)) {
                mapVocali.put(c, 1);
                vocaliSenzaDuplicati = vocaliSenzaDuplicati + c; 
            }
        }
        System.out.println(vocaliSenzaDuplicati);
    }
}
