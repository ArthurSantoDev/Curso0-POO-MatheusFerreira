package Stream;

import java.util.List;

public class StreamApiThree {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        lista.stream()
                .filter(e -> e > 5)
                .forEach(System.out::println);
    }
}
