package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiSix {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4, 2, 1, 3);
        List<Integer> novaLista = lista.stream()
                .filter(e -> e % 2 == 0) // mantém apenas números pares
                .map(e -> e * 2) // multiplica cada item por 2
                .collect(Collectors.toList()); // coleta todos os itens em uma nova lista
        System.out.println(novaLista);

        List<Integer> lista1 = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4, 2, 1, 3);
        Map<Boolean, List<Integer>> mapa = lista1.stream()
                .map(e -> e * 2) // multiplica cada item por 2
                .collect(Collectors.groupingBy(e -> e > 8)); // agrupa itens baseado no resultado
        System.out.println(mapa);

        List<Integer> lista2 = Arrays.asList(4, 1, 3, 5, 7, 8, 6, 3, 2, 4, 2, 1, 3);
        String stringUnica = lista2.stream()
                .map(String::valueOf) // transforma cada item em String
                .collect(Collectors.joining(";")); // junta todos os itens em uma única string
        System.out.println(stringUnica);
    }
}