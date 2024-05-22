package banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== EXTRATO DE CONTA CORRENTE ===\n");
        super.imprimirExtrato();
    }
}
