package banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== EXTRATO DE CONTA POUPANÇA ===\n");
        super.imprimirExtrato();
    }
}
