package Livraria;

import Livraria.Estructure.Livraria;
import Livraria.Model.Autor;
import Livraria.Model.Livro;

public class StartUp {

    public static void main(String[] args) {

        Autor autor = new Autor("Arthur");
        Autor autor1 = new Autor("Ana");

        Livro livro1 = new Livro("POO", autor, 66.00, 12);
        Livro livro2 = new Livro("Biomedic", autor1, 100.00, 20);

        Livraria livraria = new Livraria();
        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);

        livraria.listarLivros();
        Livro l = livraria.buscaLivroPorTitulo("POO");
        if (l != null) {
            System.out.println("Livro encontrado: "+ l);
        }

    }
}
