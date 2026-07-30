public class Carrinho {

    private String cor;
    private String tamanho;
    private int numRodas;

    public Carrinho(String cor, String tamanho, int numRodas) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.numRodas = numRodas;
    }

    public void exibirCaaracteristicas() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Número de Rodas: " + numRodas);
    }

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho("Vermelho", "Grande", 4);
        carrinho.exibirCaaracteristicas();

    }

}
