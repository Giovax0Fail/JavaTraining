import java.util.Scanner;

public class Scuola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomistudenti[]= new String[10];
        String nomidocenti[]= new String[10];
        int contatoreinsegnanti =0;
        int contatorestudenti=0;
        int sceltautente=0;

        while(true){
            System.out.println("\nInserisci\n 1 per inserire studenti, \n 2 per inserire degli insegnanti, \n 3 per uscire dall'inserimento e stamapare un numero studenti ed insegnanti.");
            sceltautente=input.nextInt();
            input.nextLine();


        switch(sceltautente){
            case 1:
                System.out.println("\nInserisci il nome di uno studente");
                String studente = input.nextLine();
                nomistudenti[contatorestudenti] = studente; //aggiungi studente all'array in base al contatore
                contatorestudenti++;
                break;
            case 2:
                System.out.println("\nInserisci il nome di un'insegnante");
                String insegnante = input.nextLine();
                nomidocenti[contatoreinsegnanti] = insegnante;
                contatoreinsegnanti++;
                break;
            case 3:
                System.out.println("\n Il numero di insegnanti \n");
                System.out.println(contatoreinsegnanti);
                System.out.println("\n Il numero di studenti \n");
                System.out.println(contatorestudenti + "\n");
                System.out.println("\nStudenti inseriti:");
                for (int i = 0; i < contatorestudenti; i++) {
                    System.out.println(nomistudenti[i]);
                }
                System.out.println("\nInsegnanti inseriti:");
                for (int i = 0; i < contatoreinsegnanti; i++) {
                    System.out.println(nomidocenti[i]);
                }

                input.close();
                return;


            default:
                System.out.println("Scelta non valida. Scegli solo 1 , 2 o 3");


             }
        }
    }
}
