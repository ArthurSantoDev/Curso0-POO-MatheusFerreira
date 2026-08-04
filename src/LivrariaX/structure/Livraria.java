package LivrariaX.structure;

import LivrariaX.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Item> items;

    public Livraria() {
        this.items = new ArrayList<Item>();
    }

    public void adicionarItem(Item item) {
        items.add(item);
    }

    public void listarItem() {
        if (items.isEmpty()) {
            System.out.println("Nenhum item cadastrado!");
        } else {
            for (Item i: items) {
                i.mostrarDetalhes();
                System.out.println(i.toString());
            }
        }
    }
}
