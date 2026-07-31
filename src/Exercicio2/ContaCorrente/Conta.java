package Exercicio2.ContaCorrente;

public class Conta {

    private int numConta;
    private String nomeCliente;
    private double saldoAtual;

    public void informaNumeroConta(int numConta) {
        this.numConta = numConta;
    }

    public void informaNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void informaSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public void depositar(double valorDeposito) {
        this.saldoAtual += valorDeposito;
    }

    public void sacar(double valorSaque) {

        if (this.saldoAtual - valorSaque < 0) {
            System.out.println("Não é possivel realizar o saque, saldo insuficiente");
            return;
        }
        this.saldoAtual -= valorSaque;
    }

    public double retornarSaldoAtual() {
        return this.saldoAtual;
    }

}
