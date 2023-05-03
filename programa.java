class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.cliente = "jorge";
        minhaConta.saldo = 100.0;
        /*
         * Conta c1;
         * c1 = new Conta();
         * Conta c2;
         * c2 = new Conta();
         */

        boolean consegui = minhaConta.saca(30);
        if (consegui) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }
        

        // }
        // saca 20
        // minhaConta.saca(20);
        // deposita 50
        minhaConta.deposita(50);

        System.out.println("Saldo atual: " + minhaConta.saldo);
    }
}