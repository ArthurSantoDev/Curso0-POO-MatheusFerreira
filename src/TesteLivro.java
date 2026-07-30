public class TesteLivro {

    public static void main(String[] args) {

        Livro livro = new Livro("O Senhor dos Anéis");
        livro.setAutor("J.R.R. Tolkien");
        livro.setDescricao("Uma épica história de fantasia.");
        livro.setCapaDura(true);

        System.out.println(livro);
    }
}
