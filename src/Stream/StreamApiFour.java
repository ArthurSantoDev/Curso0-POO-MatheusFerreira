package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamApiFour {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(4,6,7,8,3,5,6,8,1,2,4,2,4,7);
        lista.stream()
                .map(e -> e * 4)
                .forEach(e -> System.out.println(e + " "));
    }
}
