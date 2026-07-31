package Exercicio1;

public class Funcionario extends Pessoa{

    public Funcionario() {
        super();
    }

    public Funcionario(int codigo, String nome) {
        super(codigo, nome);
    }

    public double getSalario() {
        return 2000;
    }

    public String imprimirFolhaPagamento() {
        return "Código: " + getCodigo()+ " Nome: " + getNome()+ " Salario: "+ getSalario();

    }
}
