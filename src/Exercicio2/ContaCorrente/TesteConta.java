package Exercicio2.ContaCorrente;

public class TesteConta {

    public static void main(String[] args) {

        /*
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.informaNumeroConta(12345);
        contaCorrente.informaNomeCliente("Arthur");
        contaCorrente.depositar(1000);
        System.out.println("Depositado 1000 reais, valor na conta: "+ contaCorrente.retornarSaldoAtual());
        contaCorrente.sacar(400);
        System.out.println("Sacado 400 reais, valor na conta: "+ contaCorrente.retornarSaldoAtual());
        contaCorrente.sacar(900);
        */

        ContaPoupança contaPoupança = new ContaPoupança();
        contaPoupança.informaNumeroConta(54321);
        contaPoupança.informaNomeCliente("Arthur");
        contaPoupança.depositar(1000);
        System.out.println("Depositado 1000 reais, valor na conta: "+ contaPoupança.retornarSaldoAtual());
        contaPoupança.aplicarRendimento(5);
        System.out.println("Aplicado rendimento de 5%, valor na conta: "+ contaPoupança.retornarSaldoAtual());
        contaPoupança.sacar(400);
        System.out.println("Sacado 400 reais, valor na conta: "+ contaPoupança.retornarSaldoAtual());
        contaPoupança.sacar(900);}
}
