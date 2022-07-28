public class main {
    public static void main(String[] args) {
        Cliente Eduardo = new Cliente();
        Eduardo.setNome("Eduardo");

        Conta cc = new ContaCorrente(Eduardo);
        Conta poupanca = new ContaPoupanca(Eduardo);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
