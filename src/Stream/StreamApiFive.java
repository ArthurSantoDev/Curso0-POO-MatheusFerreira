package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApiFive {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4, 2, 1, 3);
        Optional<Integer> maiorNumero = lista.stream()
                .map(e -> e * 4) // multiplica cada item por 4
                .max(Comparator.naturalOrder()); // pega o maior item pela ordem natural
        System.out.println(maiorNumero.get());



        List<Integer> lista1 = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4, 2, 1, 3);
        Optional<Integer> menorNumero = lista1.stream()
                .map(e -> e * 4) // multiplica cada item por 4
                .min(Comparator.naturalOrder()); // pega o menor item pela ordem natural
        System.out.println(menorNumero.get());



        List<Integer> lista2 = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4, 2, 1, 3);
        Long quantidade = lista2.stream()
                .filter(e -> e % 2 == 0) // mantém apenas números pares
                .count(); // pega quantos itens restam no stream
        System.out.println(quantidade);
    }
}