package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Video1 {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan", 25));
        clientes.add(new Cliente("Maria", 30));
        clientes.add(new Cliente("Pedro", 20));
        clientes.add(new Cliente("Ana", 35));


        List<Integer> collect = clientes.stream()
                .map(c -> c.getIdade())
                .filter(v -> v >= 30)
                .collect(Collectors.toList());



        collect.forEach(c -> System.out.println(c));
    }
}
