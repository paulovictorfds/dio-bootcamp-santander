public class App {
    public static void main(String[] args) throws Exception {

        Cliente paulo = new Cliente();

        paulo.setNome("Paulo Victor");

        Conta cc = new ContaCorrente(paulo);
        Conta cp = new ContaPoupanca(paulo);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
