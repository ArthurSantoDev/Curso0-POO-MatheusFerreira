package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamApiTwo {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(4,3,5,6,4,3,6,7,7,8,1,6);
        lista.stream()
                .skip(2)
                .limit(5)
                .distinct()
                .forEach(System.out::println);

    }
}
