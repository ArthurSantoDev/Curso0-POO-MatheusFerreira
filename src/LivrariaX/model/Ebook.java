package LivrariaX.model;

public class Ebook extends Publicacao{

    private double tamanhoArquivo;


    public Ebook(String titulo, String autor, Double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("O tamanho do arquivo é: " + tamanhoArquivo + "MB");
    }
}
