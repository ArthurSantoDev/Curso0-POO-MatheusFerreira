public class Livro {

    private String titulo;
    private String autor;
    private String descricao;
    private boolean capaDura;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isCapaDura() {
        return capaDura;
    }

    public void setCapaDura(boolean capaDura) {
        this.capaDura = capaDura;
    }

    @Override
    public String toString() {
        return "Livro: " + getTitulo() + "\nAutor: " + getAutor() + "\nDescrição: " + getDescricao() + "\nCapa Dura: " + isCapaDura();
    }
}
