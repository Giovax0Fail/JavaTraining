public class UsoMotorino {
    public static void main(String[] args) {
        
        // Creazione del primo motorino
        MotorinoImmatricolato Motorino1 = new MotorinoImmatricolato("rosso", "sport", 0f, 120.0f, "AB123CD");
        System.out.println(AnsiColor.RED + "----------------------------------------------------" + AnsiColor.RESET);
        System.out.println(AnsiColor.GREEN + "Motorino 1: " + Motorino1.tipo + " (" + Motorino1.colore + ")" + AnsiColor.RESET);
        System.out.println(AnsiColor.CYAN + "Velocità iniziale: " + Motorino1.getVelocita() + " km/h" + AnsiColor.RESET);
        
        // Accelerazione del primo motorino
        Motorino1.accelera(20.0f);
        System.out.println(AnsiColor.YELLOW + "Velocità dopo accelerazione: " + Motorino1.getVelocita() + " km/h" + AnsiColor.RESET);
        
        // Creazione del secondo motorino
        MotorinoImmatricolato Motorino2 = new MotorinoImmatricolato("grigiometallizzato", "Piaggio Liberty", 40.5f, 120.0f, "AB123CD");
        System.out.println(AnsiColor.RED + "----------------------------------------------------" + AnsiColor.RESET);
        System.out.println(AnsiColor.GREEN + "Motorino 2: " + Motorino2.tipo + " (" + Motorino2.colore + ")" + AnsiColor.RESET);
        System.out.println(AnsiColor.CYAN + "Velocità iniziale: " + Motorino2.getVelocita() + " km/h" + AnsiColor.RESET);
        
        // Accelerazione del secondo motorino
        Motorino2.accelera(30.7f);
        System.out.println(AnsiColor.YELLOW + "Velocità dopo accelerazione: " + Motorino2.getVelocita() + " km/h" + AnsiColor.RESET);

        // Creazione del terzo motorino
        MotorinoImmatricolato Motorino3 = new MotorinoImmatricolato("rosso", "Aprilia Scarabeo", 30.5f, 60.0f, "CV1234");
        System.out.println(AnsiColor.RED + "----------------------------------------------------" + AnsiColor.RESET);
        System.out.println(AnsiColor.GREEN + "Motorino 3: " + Motorino3.tipo + " (" + Motorino3.colore + ")" + AnsiColor.RESET);
        System.out.println(AnsiColor.CYAN + "Velocità iniziale: " + Motorino3.getVelocita() + " km/h" + AnsiColor.RESET);
        
        // Accelerazione del terzo motorino
        Motorino3.accelera(30.7f);
        System.out.println(AnsiColor.YELLOW + "Velocità dopo accelerazione: " + Motorino3.getVelocita() + " km/h" + AnsiColor.RESET);
        
        // Separazione finale
        System.out.println(AnsiColor.RED + "----------------------------------------------------" + AnsiColor.RESET);
        
        // Riassunto finale
        System.out.println(AnsiColor.PURPLE + "Stato finale dei motorini:" + AnsiColor.RESET);
        System.out.println(AnsiColor.GREEN + "Motorino 1 - Velocità finale: " + Motorino1.getVelocita() + " km/h" + AnsiColor.RESET);
        System.out.println(AnsiColor.GREEN + "Motorino 2 - Velocità finale: " + Motorino2.getVelocita() + " km/h" + AnsiColor.RESET);
        System.out.println(AnsiColor.GREEN + "Motorino 3 - Velocità finale: " + Motorino3.getVelocita() + " km/h" + AnsiColor.RESET);
        System.out.println(AnsiColor.RED + "----------------------------------------------------" + AnsiColor.RESET);
    }
}

class AnsiColor {
    // Codici ANSI per il colore
    public static final String RESET = "\u001B[0m"; 
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
}


class Motorino {
    protected String colore;
    protected String tipo;
    protected float velocita;  
    protected boolean antifurto;

    // Costruttore della classe Motorino
    public Motorino(String colore, String tipo, float velocita) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocita = velocita;
        this.antifurto = false;
    }

    public float getVelocita() {
        return velocita;
    }

    public void accelera(float incremento) {
        if (!antifurto) {
            velocita = velocita+ incremento;
        }
    }

    // Metodo per attivare l'antifurto
    public void inserisciAntifurto() {
        this.antifurto = true;
    }
}

class MotorinoImmatricolato extends Motorino {
    public float maxVelocita;
    private String targa;

    // Costruttore della classe MotorinoImmatricolato
    public MotorinoImmatricolato(String colore, String tipo, float velocita, float maxVelocita, String targa) {
        super(colore, tipo, velocita);  // Chiamata al costruttore della classe base Motorino
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    // Metodo per ottenere la velocità massima
    public float getMax() {
        return maxVelocita;
    }

    public void accelera(float incremento) {
        if (antifurto==false) {
            float nuovaVelocita = velocita + incremento;
            if (nuovaVelocita <= maxVelocita) {
                velocita = nuovaVelocita;
            } else {
                velocita = maxVelocita;
            }
        }
    }
}
