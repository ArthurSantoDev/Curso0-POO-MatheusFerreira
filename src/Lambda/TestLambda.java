package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        lista.stream()
                .limit(7)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(System.out::println);
    }
}
