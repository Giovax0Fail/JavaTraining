class ContoCorrente{

    public static void main(String[] args){
    double saldo;
    void deposito(double importo){
        saldo += importo;
        }
        void prelievo(double importo){
        saldo -= importo;
        }
        double saldo(){
        return saldo;
        }
    }
}
