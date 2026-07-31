package Exercicio2.ContaCorrente;

public class ContaPoupança extends Conta{

    public void aplicarRendimento(double percentual) {
        double saldo = retornarSaldoAtual();
        double rendimento = saldo * percentual / 100;
        depositar(rendimento);
    }
}
