package Collections;

import java.util.HashSet;
import java.util.Set;

public class ExemplosSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new HashSet<>();
        Pessoa joao = new Pessoa(1L, "João");
        pessoas.add(joao);

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("-----------------------");
        pessoas.add(joao);

        for (Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
