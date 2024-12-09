class Banca{

    public static void main(String[] args){
        //2 istanze di classe conto corrente c1 e c2
        ContoCorrente c1 = new ContoCorrente(100);
        ContoCorrente c2 = new ContoCorrente(400);
        /*
        Eseguo un deposito
         */
        c1.deposito(500);
        c1.prelievo(200);
        c2.deposito(100);
        c2.prelievo(200);

        double saldo1 = c1.saldo();
        double saldo2 = c2.saldo();

        System.out.println("Saldo conto 1 =" + saldo1);
        System.out.println("Saldo conto 2 =" + saldo2);
    }
}