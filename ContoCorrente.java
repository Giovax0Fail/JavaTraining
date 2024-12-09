class ContoCorrente {
    private double saldo;
    static int conti; //n di conti correnti attivi + static-> attributo di classe

        static  void inc(){
            ++conti;
        }

        static void dec(){
            --conti;
        }
    // Costruttore per inizializzare il saldo
    ContoCorrente(double saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    // Metodo per depositare un importo
    public void deposito(double importo) {
        saldo += importo;
    }

    // Metodo per prelevare un importo
    public void prelievo(double importo) {
        saldo -= importo;
    }

    // Metodo getter per ottenere il saldo
    public double getSaldo() {
        return saldo;
    }


}
