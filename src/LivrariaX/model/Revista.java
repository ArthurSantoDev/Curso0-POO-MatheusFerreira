package LivrariaX.model;

public class Revista extends Publicacao{

    private int edicao;

    public Revista(String titulo, String autor, Double preco, int edicao) {
        super(titulo, autor, preco);
        this.edicao = edicao;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("A edição é: " + edicao);
    }
}
