import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cliente klayvert = new Cliente(
                "Klayvert",
                "123.456.789-11",
                LocalDate.parse("2003-06-27")
        );

        Conta cc = new ContaCorrente(klayvert);
        Conta poupanca = new ContaPoupanca(klayvert);

        cc.depositar(120);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        /* ================================== Novo Cliente ====================================== */

        Cliente jose = new Cliente(
                "José",
                "123.456.789-12",
                LocalDate.parse("2000-01-22")
        );

        Conta cc2 = new ContaCorrente(jose);
        Conta poupanca2 = new ContaPoupanca(jose);

        cc2.depositar(120);
        cc2.transferir(100, poupanca2);

        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();
    }

}