package Exercicios;

public class TesteExercicios {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(1, "Arthur");
        System.out.println(gerente.imprimirFolhaPagamento());

        Vendedor vendedor = new Vendedor(2, "Ana");
        System.out.println(vendedor.imprimirFolhaPagamento());

        Telefonista telefonista = new Telefonista(3, "João");
        System.out.println(telefonista.imprimirFolhaPagamento());

    }
}
