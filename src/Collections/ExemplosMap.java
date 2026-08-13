package Collections;

import java.util.HashMap;
import java.util.Map;

public class ExemplosMap {
    public static void main(String[] args) {
        Map<Long, Pessoa> mapa = new HashMap<>();

        Pessoa joao = new Pessoa(1L, "João");

        mapa.put(1L, joao);
        Pessoa joao2 = mapa.get(1L);
    }
}
