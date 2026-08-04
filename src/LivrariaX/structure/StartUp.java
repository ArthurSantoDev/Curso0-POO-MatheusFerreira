package LivrariaX.structure;

import LivrariaX.model.Ebook;
import LivrariaX.model.Livro;
import LivrariaX.model.Revista;

import java.util.Scanner;

public class StartUp {

    public static void main(String[] args) {

        Livraria livraria = new Livraria();
        Scanner sc = new Scanner(System.in);

        int opcao = 9;

        while (opcao != 0) {
            System.out.println("Menu");
            System.out.println("1 Cadastrar Livro");
            System.out.println("2 Cadastrar Ebook");
            System.out.println("3 Cadastrar Revista");
            System.out.println("4 Listar items");
            System.out.println("5 Sair");
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1: {
                System.out.println("Titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Autor: ");
                String autor = sc.nextLine();
                System.out.println("Preco: ");
                Double preco = sc.nextDouble();
                System.out.println("Numero de paginas: ");
                int numeroPaginas = sc.nextInt();
                sc.nextLine();
                Livro l = new Livro(titulo, autor, preco, numeroPaginas);
                livraria.adicionarItem(l);

                break;
            }

            case 2: {
                System.out.println("Titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Autor: ");
                String autor = sc.nextLine();
                System.out.println("Preco: ");
                Double preco = sc.nextDouble();
                System.out.println("Numero de paginas: ");
                int numeroPaginas = sc.nextInt();
                sc.nextLine();
                System.out.println("Tamanho do arquivo: ");
                double tamanhoArquivo = sc.nextDouble();
                sc.nextLine();
                Ebook ebook = new Ebook(titulo, autor, preco, tamanhoArquivo);
                livraria.adicionarItem(ebook);

                break;
            }

            case 3: {
                System.out.println("Titulo: ");
                String titulo = sc.nextLine();
                System.out.println("Autor: ");
                String autor = sc.nextLine();
                System.out.println("Preco: ");
                Double preco = sc.nextDouble();
                System.out.println("Numero de paginas: ");
                int numeroPaginas = sc.nextInt();
                sc.nextLine();
                System.out.println("Edicao: ");
                int edicao = sc.nextInt();
                sc.nextLine();
                Revista revista = new Revista(titulo, autor, preco, edicao);
                livraria.adicionarItem(revista);

                break;
            }

            case 4: {
                livraria.listarItem();
            }

            case 5: {
                System.out.println("Saindo...");
                break;
            }

            default:{
                throw  new IllegalArgumentException("Opção inválida: " + opcao);
            }


        }

        }


    }
}
