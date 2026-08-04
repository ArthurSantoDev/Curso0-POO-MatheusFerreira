package Livraria.Estructure;

import Livraria.Model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Livro> livros;

     public Livraria() {
         livros = new ArrayList<Livro>();
     }

     public void adicionarLivro(Livro livro) {
            livros.add(livro);
     }

     public void listarLivros() {
         System.out.println("Livros disponíveis na livraria:");
         for (Livro l : livros) {
             System.out.println(l.toString());
         }
     }

     public Livro buscaLivroPorTitulo(String titulo) {
         for (Livro l : livros) {
             if (l.getTitulo().equalsIgnoreCase(titulo)) {
                 return l;
             }
         }
         return null;
     }



}
