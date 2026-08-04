package Livraria.Model;

public class TesteLivros {
    public static void main(String[] args) {

        Autor autor1 = new Autor("J.K. Rowling");
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor1, 39.90, 10);

        System.out.println(livro1.toString());
    }
}
