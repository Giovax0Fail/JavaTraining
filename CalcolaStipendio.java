public class CalcolaStipendio {
    public static void main(String[] args) {
        // Creazione di un oggetto Dipendente
        Dipendente dipendente1 = new Dipendente("00309", 1000, 7.50);
        dipendente1.stampa();

        // Calcola stipendio per 10 ore di straordinario
        System.out.println("Lo stipendio del dipendente è: " + dipendente1.getStipendio());
        System.out.println("La paga del dipendente per 10 ore di straordinario è: " + dipendente1.paga(10));

        // Creazione di un oggetto DipendenteA
        DipendenteA dipendente2 = new DipendenteA("00201", 1500, 8.50, 0);
        dipendente2.stampa();

        dipendente2.prendiMalattia(5);
        dipendente2.paga(3);

        dipendente2.stampaMalattia();

    }
}

class Dipendente {
    String matricola;
    double stipendio, straordinario;

    public Dipendente(String matricola, double stipendio, double straordinario) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.straordinario = straordinario;
    }

    double getStipendio() {
        return stipendio;
    }

    double paga(int ore) {
        return stipendio + ore * straordinario;
    }

    void stampa() {
        System.out.println("Matricola: " + matricola + "\n" + "Stipendio: " + stipendio + "\n" + "Straordinario: "
                + straordinario + "\n");
    }
}

// Sottoclasse DipendenteA
class DipendenteA extends Dipendente {
    protected int malattia;

    // Costruttore di DipendenteA
    public DipendenteA(String matricola, double stipendio, double straordinario, int malattia) {
        super(matricola, stipendio, straordinario);
        this.malattia = malattia;
    }

    void prendiMalattia(int gmalattia) {
        malattia += gmalattia;
    }

    @Override
    double paga(int ore) {
        double p = super.paga(ore);
        if (malattia == 0) {
            return p;
        } else {
            return p - malattia * 15.0;
        }
    }

    void stampaMalattia() {
        System.out.println("Giorni di malattia: " + malattia);
    }
}
