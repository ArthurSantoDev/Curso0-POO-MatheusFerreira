package Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        Usuario objeto1 = new Usuario("Arthur");
        Usuario objeto2 = new Usuario("Joao");
        Usuario objeto3 = new Usuario("Maria");
        Usuario objeto4 = new Usuario("Ana");

        List<Usuario> listaDeObjetos = new ArrayList<Usuario>();
        listaDeObjetos.add(objeto1);
        listaDeObjetos.add(objeto2);
        listaDeObjetos.add(objeto3);
        listaDeObjetos.add(objeto4);

        List<Usuario> listaDeObjetos2 = new LinkedList<Usuario>();
        listaDeObjetos2.add(objeto1);
        listaDeObjetos2.add(objeto3);
        listaDeObjetos2.add(objeto4);
        listaDeObjetos2.add(objeto2);

        Set<Usuario> conjunto = new HashSet<Usuario>();

        Map<Usuario, Integer> mapa = new HashMap<Usuario, Integer>();
        mapa.put(objeto1, 1);
        mapa.put(objeto2, 2);
        mapa.put(objeto3, 3);
        mapa.put(objeto4, 4);

        for (Map.Entry<Usuario, Integer> entry : mapa.entrySet()) {
            String chave = entry.getKey().nome;
            Integer valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor: " + valor);
        }

        System.out.println("Quantidade de elementos: "+ mapa.size());
    }
}
