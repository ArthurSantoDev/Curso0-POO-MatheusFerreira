package Livraria.Model;

public class Livro {

    private String titulo;
    private Autor autor;
    private double preco;
    private int estoque;

    public Livro(String titulo, Autor autor, double preco, int estoque){
        this.autor = autor;
        this.estoque = estoque;
        this.preco = preco;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Livro: " + getTitulo() + "\nAutor: " + getAutor() + "\nPreço: " + getPreco() + "\nEstoque: " + getEstoque();
    }
}
