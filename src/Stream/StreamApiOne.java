package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamApiOne {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        lista.stream().forEach(System.out::println);
    }
}
