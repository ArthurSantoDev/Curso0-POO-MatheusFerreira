package LivrariaX.model;

public class Livro extends Publicacao{

    private int numeroPaginas;

    public Livro(String titulo, String autor, Double preco, int numeroPaginas) {
        super(titulo, autor, preco);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Numero de paginas: "+numeroPaginas);
    }
}
